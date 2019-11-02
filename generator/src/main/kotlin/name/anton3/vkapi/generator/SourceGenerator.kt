package name.anton3.vkapi.generator

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import name.anton3.vkapi.generator.definition.*
import name.anton3.vkapi.generator.json.*
import name.anton3.vkapi.generator.source.JsonTypeRef
import name.anton3.vkapi.generator.source.KotlinSourceWriter
import name.anton3.vkapi.generator.source.TypeId
import name.anton3.vkapi.generator.source.joinToPath
import name.anton3.vkapi.json.core.vkBaseObjectMapper
import name.anton3.vkapi.method.*
import name.anton3.vkapi.vktypes.*
import org.apache.logging.log4j.kotlin.Logging
import java.nio.file.Files
import java.nio.file.Path
import kotlin.streams.asSequence

class SourceGenerator(val basePackage: String) {

    companion object : Logging

    private val methods: MutableMap<String, MethodSchema> = mutableMapOf()
    private val definitions: MutableMap<String, TypeSchema> = mutableMapOf()
    private val responses: MutableMap<String, ObjectType> = mutableMapOf()

    private val typeSpace = TypeSpace()

    fun loadMethods(fileName: String) {
        methods += OBJECT_MAPPER.readValue<Schema>(readSchemaTextFromFile(fileName))
            .methods.orEmpty().associateBy { it.name }
    }

    fun loadDefinitions(fileName: String) {
        definitions += OBJECT_MAPPER.readValue<Schema>(readSchemaTextFromFile(fileName))
            .definitions.orEmpty().toMutableMap()
    }

    fun loadResponses(fileName: String) {
        responses += OBJECT_MAPPER.readValue<Schema>(readSchemaTextFromFile(fileName))
            .definitions.orEmpty().mapValues { (_, v) -> v as ObjectType }
    }

    fun resolveTypes() {
        defineCommonTypes()
        resolveMethods()
        processTopLevelTypes()
        splitSomeObjects()

        logger.info("Defined ${typeSpace.typesCount} types")
        typeSpace.logDefinedTypeNames()
    }

    private fun resolveMethods() {
        logger.info("Total methods: ${methods.size}")
        val normalizedMethods = methods.values
            .map { it.normalize() }.flatten().filter { responseSchemaIsDefined(it.response) }
        logger.info("Normalized methods: ${normalizedMethods.size}")
        normalizedMethods.forEach { makeMethod(it) }
    }

    private fun splitSomeObjects() {
        listOf(
            TypeId("board.objects.TopicComment", basePackage = basePackage),
            TypeId("wall.objects.WallComment", basePackage = basePackage)
        ).forEach {
            typeSpace.splitToInterfaceImplementationPairIfNeeded(it)
        }
    }

    private fun processTopLevelTypes() {
        val generateUnusedTypes = false

        @Suppress("ConstantConditionIf")
        if (generateUnusedTypes) {
            for ((ref, def) in definitions) makeType(::nameObject, ref, def)
        }
    }

    private fun responseSchemaIsDefined(ref: JsonTypeRef): Boolean {
        val result = responses.containsKey(ref)
        if (!result)
            logger.warn("No response type defined $ref")
        return result
    }

    private fun makeMethod(methodsSchema: NormalizedMethod) {
        val methodResultType = makeMethodResultType(methodsSchema)
        if (methodResultType == null) {
            logger.warn("Can't define method ${methodsSchema.name} because of problems with result")
            return
        }

        val methodType = MethodDefinition(
            methodUrl = methodsSchema.name,
            arguments = methodsSchema.parameters.map {
                MethodArgument(
                    typeId = resolveMethodParamToTypeId(methodsSchema.name, it),
                    name = it.name,
                    required = it.required,
                    description = it.parameterType.description
                )
            }.distinctBy { it.name },
            result = methodResultType,
            defaultParams = methodsSchema.fixedParams,
            description = methodsSchema.description
        )

        val typeId = nameMethod(methodsSchema.name, basePackage).copy(name = methodsSchema.className)
        typeSpace.registerTypeImplementation(typeId, methodType)
    }

    private fun makeMethodResultType(methodSchema: NormalizedMethod): TypeId? {
        val responseRef = methodSchema.response
        val responseObject = responses[responseRef]!!.response

        val needsVkListWrapping = responseObject is ObjectType &&
                responseObject.properties.containsKey("items") &&
                responseObject.properties.containsKey("count") &&
                responseObject.properties.size == 2

        val items = if (responseObject is ObjectType && needsVkListWrapping) {
            (responseObject.properties["items"] as ArrayType).items
        } else {
            responseObject
        }

        val type = makeType(::nameResponse, responseRef, items) ?: return null
        val vkListWrapped = if (needsVkListWrapping) makeVkList(type) else type

        return makeVkMethod(vkListWrapped, makeMethodAccessType(methodSchema))
    }

    private fun makeArrayType(itemType: TypeId): TypeId {
        return TypeId<List<*>>(itemType)
    }

    private fun makeVkMethod(resultType: TypeId, methodRequirement: TypeId): TypeId {
        return TypeId<VkMethod<*, *>>(resultType, methodRequirement)
    }

    private fun makeVkList(typeId: TypeId): TypeId {
        return TypeId<VkList<*>>(typeId)
    }

    private fun makeMethodAccessType(methodSchema: NormalizedMethod): TypeId {
        val interfacePackage = "name.anton3.vkapi.method"

        val tokenTypes = methodSchema.accessTokenType.toSet()

        val filteredTokenTypes = listOf(
            AccessTokenType.USER,
            AccessTokenType.GROUP,
            AccessTokenType.SERVICE
        ).filter { it in tokenTypes }

        if (filteredTokenTypes.isEmpty()) {
            logger.warn("Absent method requirements for ${methodSchema.name}")
            return TypeId(interfacePackage, "MethodRequirement")
        }

        val interfaceName = filteredTokenTypes.joinToString("", postfix = "Method") { it.value.capitalize() }

        return TypeId(interfacePackage, interfaceName)
    }

    private fun makeType(nameStrategy: NameStrategy, typeRef: JsonTypeRef, typeSchema: TypeSchema?): TypeId? {
        if (typeSchema == null) {
            logger.warn("Type $typeRef is undefined")
            return null
        }
        val alreadyDefined = typeSpace.resolveTypeIdByJsonRefOrNull(typeRef)

        if (alreadyDefined != null) {
            return alreadyDefined
        }

        return when (typeSchema) {
            is SimpleType -> typeSpace.resolveTypeIdByJsonRef(typeSchema.ref)
            is OneOfType -> makeOneOfType(::nameObject, typeRef, typeSchema)
            is AllOfType -> makeAllOfType(::nameObject, typeRef, typeSchema)
            is RefType -> {
                val toJsonRef = typeSchema.ref
                val objDefinition = definitions[toJsonRef]
                makeType(::nameObject, toJsonRef, objDefinition)
            }
            is SimpleMultiType -> typeSpace.resolveTypeIdByJsonRef("string")
            is EnumType -> makeEnumType(nameStrategy, typeRef, typeSchema)
            is ArrayType -> makeType(::nameObject, typeRef, typeSchema.items)?.let { makeArrayType(it) }
            is ObjectType -> defineObjectType(nameStrategy, typeRef, typeSchema)
            is PatternPropertiesType -> makeMapResultType()
        }
    }

    // TODO
    private fun makeEnumType(nameStrategy: NameStrategy, responseRef: JsonTypeRef, typeObject: EnumType): TypeId {
        val typeIdByRef = typeSpace.resolveTypeIdByJsonRefOrNull(responseRef)
            ?.let { typeSpace.resolveTypeAliases(it) }

        if (typeIdByRef != null) return typeIdByRef

        val typeId = nameStrategy(responseRef, basePackage)
        if (typeSpace.definedTypes[typeId]?.fixedName == true)
            return typeId

        val definition = EnumDefinition.decodeTypeDefinition(
            typeObject.enum,
            typeObject.enumNames,
            typeObject.type == NodeType.INTEGER
        )

        return if (definition == BuiltinDefinition)
            TypeId<Boolean>()
        else
            typeSpace.registerTypeImplementation(typeId, definition)
    }

    private fun makeOneOfType(nameStrategy: NameStrategy, responseRef: JsonTypeRef, typeObject: OneOfType): TypeId? {
        //для каждго ref - делаем сплит и родительскому интерфйесу добавляем в родители пустой маркер-интерфейс этого объекта
        val rootTypeId = nameStrategy(responseRef, basePackage)

        val rootType = ObjectDefinition(
            props = emptyList(),
            kind = ObjectDefinition.Kind.INTERFACE,
            description = typeObject.description
        )

        typeSpace.registerTypeReference(responseRef, rootTypeId)
        typeSpace.registerTypeImplementation(rootTypeId, rootType)

        typeObject.oneOf.forEach { item ->
            when (item) {
                is RefType -> {
                    val refType = makeType(::nameObject, item.ref, item)!!
                    typeSpace.addParentToType(refType, rootTypeId)
                }
                is ObjectType -> {
                    val refType =
                        makeType(::nameObject, responseRef + "_" + item.properties.entries.first().key, item)!!
                    typeSpace.addParentToType(refType, rootTypeId)
                }
                else -> {
                    logger.warn("Can't process ${item.javaClass.simpleName}")
                    return null
                }
            }
        }
        return rootTypeId
    }

    private fun makeAllOfType(
        nameStrategy: NameStrategy,
        responseRef: JsonTypeRef,
        typeObject: AllOfType
    ): TypeId? {
        //OneOf - игнорируем
        //для каждго ref - делаем сплит и добавляем свойства из него
        //для properties - просто получаем список свойств
        val ownProps = typeObject.allOf.filterIsInstance(ObjectType::class.java)
            .flatMap { objectPropsToClassProps(it.properties, nameStrategy, responseRef, it.required) }.toSet().toList()

        val rootType = ObjectDefinition(
            props = ownProps,
            kind = ObjectDefinition.Kind.CLASS,
            description = typeObject.description
        )

        val rootTypeId = nameStrategy(responseRef, basePackage)
        typeSpace.registerTypeReference(responseRef, rootTypeId)
        typeSpace.registerTypeImplementation(rootTypeId, rootType)

        typeObject.allOf.filterIsInstance(RefType::class.java)
            .map {
                val refObject = definitions[it.ref]
                makeType(::nameObject, it.ref, refObject)
                    ?: error("Cant make ref type for ${it.ref}")
            }.toSet().forEach { parentTypeId ->
                typeSpace.addParentToType(rootTypeId, parentTypeId)
            }


        val anyOf = typeObject.allOf.firstOrNull { it is OneOfType } as? OneOfType
        if (anyOf != null) {
            typeSpace.splitToInterfaceImplementationPairIfNeeded(rootTypeId)

            anyOf.oneOf.forEach { item ->
                when (item) {
                    is RefType -> {
                        val refType = makeType(::nameObject, item.ref, item)!!
                        typeSpace.addParentToType(refType, rootTypeId)
                    }

                    is ObjectType -> {
                        val refType = makeType(
                            ::nameObject,
                            responseRef + "_" + item.properties.entries.first().key,
                            item
                        )!!
                        typeSpace.addParentToType(refType, rootTypeId)
                    }
                    else -> logger.warn("Cant process ${item.javaClass.simpleName}")
                }


            }
        }

        return rootTypeId
    }

    private fun defineObjectType(
        nameStrategy: NameStrategy,
        responseRef: JsonTypeRef,
        typeObject: ObjectType
    ): TypeId? {
        val result = typeSpace.resolveTypeIdByJsonRefOrNull(responseRef)
        if (result != null)
            return result

        val typeId = nameObject(responseRef, basePackage)
        typeSpace.registerTypeReference(responseRef, typeId)

        val props =
            objectPropsToClassProps(typeObject.properties, nameStrategy, responseRef, typeObject.required).map { prop ->
                prop.copy(nullable = !typeObject.required.contains(prop.name))
            }

        typeObject.description

        val definition = ObjectDefinition(
            props = props,
            kind = ObjectDefinition.Kind.CLASS,
            description = typeObject.description
        )

        return typeSpace.registerTypeImplementation(typeId, definition)
    }

    private fun objectPropsToClassProps(
        properties: Map<String, TypeSchema>,
        nameStrategy: NameStrategy,
        responseRef: JsonTypeRef,
        required: List<String> = emptyList()
    ): List<Prop> {
        return properties.mapNotNull { (name, propObj) ->
            val typeId = makeType(nameStrategy, responseRef + "_" + name, propObj)
            if (typeId == null) {
                logger.warn("Can't resolve $responseRef > $name")
                return@mapNotNull null
            }

            val finalType = when {
                name in listOf("date", "timestamp", "update_time") && typeId.name == "Int" -> TypeId<VkDate>()
                name == "bdate" && typeId.name == "String" -> TypeId<VkBirthDate>()
                else -> typeId
            }

            Prop(
                name = name,
                typeId = finalType,
                inherited = false,
                nullable = !required.contains(name),
                description = propObj.description
            )
        }.map {
            it.copy(typeId = typeSpace.resolveTypeAliases(it.typeId))
        }
    }

    private fun makeMapResultType(): TypeId {
        val typeId = TypeId<Map<*, *>>(TypeId<Int>(), TypeId<Boolean>())

        return typeSpace.registerTypeImplementation(typeId, BuiltinDefinition)
    }

    // TODO
    private fun resolveMethodParamToTypeId(methodName: String, param: MethodParameterSchema): TypeId {
        val type = param.parameterType

        val parts = methodName.split(".")
        val candidateTypeId = nameObject((parts + param.name).joinToString("_"), basePackage)

        if (type is EnumType) {
            return defineEnumType(candidateTypeId, type)
        } else if (type is ArrayType && type.items is EnumType) {
            return makeArrayType(defineEnumType(candidateTypeId, type.items))
        }

        // dirty hack; should use a proper naming scheme
        return makeType(::nameObject, "SHOULD_NOT_BE_USED", type)!!
    }

    // TODO
    private fun defineEnumType(expectedTypeId: TypeId, typeObject: EnumType): TypeId {
        val definition = EnumDefinition.decodeTypeDefinition(
            typeObject.enum,
            typeObject.enumNames,
            typeObject.type == NodeType.INTEGER
        )

        val oldTypeId = typeSpace.definedTypes.entries.find { it.value == definition }?.key
        if (oldTypeId == expectedTypeId) return oldTypeId

        val mergedTypeId = oldTypeId?.let { mergeEqualTypes(oldTypeId, expectedTypeId, basePackage) }

        return if (mergedTypeId != null && !definition.fixedName) {
            logger.info("Merge ${oldTypeId.name} + ${expectedTypeId.name} -> ${mergedTypeId.name}")
            typeSpace.renameType(oldTypeId, mergedTypeId)
        } else {
            if (oldTypeId != null) {
                logger.info("Equal types $oldTypeId and $expectedTypeId were not merged")
            }
            typeSpace.registerTypeImplementation(expectedTypeId, definition)
            expectedTypeId
        }
    }

    private fun defineCommonTypes() {
        // Types that are not generated
        typeSpace.registerBuiltin<Void>()
        typeSpace.registerBuiltin<List<*>>()
        typeSpace.registerBuiltin<Map<*, *>>()
        typeSpace.registerBuiltin<JsonDeserialize>()
        typeSpace.registerBuiltin<JsonProperty>()
        typeSpace.registerBuiltin<VkDate>()
        typeSpace.registerBuiltin<VkList<*>>()
        typeSpace.registerBuiltin<VkBirthDate>()
        typeSpace.registerBuiltin<VkMethod<*, *>>()
        typeSpace.registerBuiltin<MethodRequirement>()
        typeSpace.registerBuiltin<UserMethod>()
        typeSpace.registerBuiltin<GroupMethod>()
        typeSpace.registerBuiltin<ServiceMethod>()
        typeSpace.registerBuiltin<UserGroupMethod>()
        typeSpace.registerBuiltin<UserServiceMethod>()
        typeSpace.registerBuiltin<UserGroupServiceMethod>()
        typeSpace.registerBuiltin<ValueEnum<*>>()
        typeSpace.registerBuiltin("com.fasterxml.jackson.module.kotlin.jacksonTypeRef")
        typeSpace.registerBuiltin("name.anton3.vkapi.vktypes.parseEnum")

        // Primitive schema types
        typeSpace.registerVkPrimitiveType<Int>("integer")
        typeSpace.registerVkPrimitiveType<String>("string")
        typeSpace.registerVkPrimitiveType<Boolean>("boolean")
        typeSpace.registerVkPrimitiveType<Double>("number")

        // Redefine some schema types to better representations
        typeSpace.registerVkPrimitiveType<BoolInt>("base_bool_int")
        typeSpace.registerVkPrimitiveType<PropertyExists>("base_property_exists")
        typeSpace.registerVkPrimitiveType<OkResponse>("base_ok_response")
    }

    private fun deleteOldAndRecreate(absPath: Path) {
        Files.createDirectories(absPath)
        Files.walk(absPath).asSequence().map(Path::toFile).sortedDescending().forEach { it.delete() }
        Files.createDirectories(absPath)
    }

    private fun concatenatePackage(packagePath: String, fileName: String): String {
        return if (packagePath.last() == '/') "$packagePath$fileName" else "$packagePath/$fileName"
    }

    private fun loadPatchesFromFiles(patchFileNames: List<String>, patchPackage: String) {
        patchFileNames.forEach { fileName ->
            val jsonString = readTextFromFile(concatenatePackage(patchPackage, fileName))
            val patch: Patch = OBJECT_MAPPER.readValue(jsonString)

            methods += patch.methods.associateBy { it.name }
            responses += patch.responses
            definitions += patch.objects
        }
    }

    fun loadPatchesFromPackage(patchPackage: String) {
        val packageWithSlash = concatenatePackage(patchPackage, "")
        val fileNames = readTextFromFile(packageWithSlash).lines().filter { it.isNotEmpty() }
        loadPatchesFromFiles(fileNames, patchPackage = patchPackage)
    }

    fun writeSourceTo(rootPath: Path) {
        val basePath = joinToPath(basePackage.split('.'))
        deleteOldAndRecreate(rootPath.resolve(basePath))

        typeSpace.definedTypes.forEach { (typeId, type) ->
            if (type.hasSource) {
                val source = type.generateSource(basePackage, typeId, KotlinSourceWriter(typeSpace))
                val filePath = rootPath.resolve(typeId.filePath())
                Files.createDirectories(filePath.parent)
                Files.write(filePath, source.split('\n'))
            }
        }

        writeTypeResolver(rootPath)
    }

    private fun writeTypeResolver(rootPath: Path) {
        val sourceWriter = KotlinSourceWriter(typeSpace)
        val interfaceMapping = InterfaceMapping(typeSpace)

        if (interfaceMapping.hasSource) {
            val typeId = interfaceMapping.typeId(basePackage)
            val source = interfaceMapping.generateSource(basePackage, typeId, sourceWriter)

            val filePath = rootPath.resolve(typeId.filePath())
            Files.createDirectories(filePath.parent)
            Files.write(filePath, source.split("\n"))
        }
    }

}

internal val OBJECT_MAPPER: ObjectMapper = makeObjectMapper()

private fun makeObjectMapper(): ObjectMapper {
    val om = vkBaseObjectMapper()
    om.propertyNamingStrategy = PropertyNamingStrategy.LOWER_CAMEL_CASE
    om.registerModule(KotlinModule())
    om.registerModule(SimpleModule().addDeserializer(TypeSchema::class.java, TypeSchemaDeserializer()))
    om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true)
    return om
}
