package name.anton3.vkapi.generator

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import name.anton3.vkapi.generator.json.*
import name.anton3.vkapi.generator.source.*
import org.apache.logging.log4j.kotlin.Logging
import java.nio.file.Files
import java.nio.file.Path
import kotlin.streams.asSequence

class SourceGenerator(val basePackage: String) {

    companion object : Logging

    private lateinit var methodsSchema: MethodsSchema
    private lateinit var objectsSchema: ObjectsSchema
    private lateinit var responsesSchema: ResponsesSchema

    private val jsonObjects = HashMap<JsonTypeRef, Object>()

    private val typeSpace = TypeSpace()

    fun methodsSchemaFrom(fileName: String) {
        val jsonString = readSchemaTextFromFile(fileName)
        methodsSchema = OBJECT_MAPPER.readValue(jsonString)

    }

    fun loadObjectsDefinitionsFrom(fileName: String) {
        val jsonString = readSchemaTextFromFile(fileName)
        objectsSchema = OBJECT_MAPPER.readValue(jsonString)
        objectsSchema.definitions.forEach { (ref, obj) ->
            jsonObjects[ref] = obj
        }
    }

    fun loadResponsesDefinitionsFrom(fileName: String) {
        val jsonString = readSchemaTextFromFile(fileName)
        responsesSchema = OBJECT_MAPPER.readValue(jsonString)
        responsesSchema.definitions.forEach { (ref, obj) ->
            jsonObjects[ref] = obj.properties.response
        }

    }

    fun resolveTypes() {
        defineCommonTypes()
        resolveMethods()
        splitSomeObjects()

        logger.info("Defined ${typeSpace.typesCount} types")
        typeSpace.printDefinedTypesNames()
    }

    private fun splitSomeObjects() {
        listOf(
            TypeId("board.objects.TopicComment", basePackage = basePackage),
            TypeId("wall.objects.WallComment", basePackage = basePackage)
        ).forEach {
            typeSpace.splitToInterfaceImplementationPairIfNeeded(it)
        }
    }

    /**
     * пройти по всем методам
     * каждый из них расщипить если нужно, согласно логике
     * Для каждого из получившихся "простых" методов:
     *  Определить "тип" (объект,список,VkСписок)
     *  Сформировать Type для возвращаемого значени
     *  Объявить Type для метода
     */
    private fun resolveMethods() {
        logger.info("Total methods: ${methodsSchema.methods.size}")
        val normalizedMethods = methodsSchema.methods.mapNotNull { normalizeMethodDefinition(it) }.flatten()
            .filter { responseSchemaIsDefined(it.responses.response) }
        logger.info("Normalized  methods: ${normalizedMethods.size}")
        normalizedMethods.forEach(this::makeMethod)
    }

    private fun responseSchemaIsDefined(ref: SchemaFileRef): Boolean {
        val result = responsesSchema.definitions.containsKey(ref.toJsonRef())
        if (!result)
            logger.warn("No response type defined $ref")
        return result
    }

    private fun normalizeMethodDefinition(methodSchema: MethodSchema): List<MethodSchema>? {
        return methodSchema.responses.normalizeMethodDefinition(methodSchema)
    }

    /**
     *  Сформировать Type для возвращаемого значения
     *  Объявить Type для метода
     */
    private fun makeMethod(methodsSchema: MethodSchema) {
        val methodResultType = makeMethodResultType(methodsSchema)
        if (methodResultType == null) {
            logger.warn("Can't define method ${methodsSchema.name} because of problems with result")
            return
        }

        val methodType = MethodType(
            methodUrl = methodsSchema.name,
            arguments = methodsSchema.parameters.map {
                MethodArgument(
                    typeId = resolveMethodParamToTypeId(methodsSchema.name, it),
                    name = it.name,
                    required = it.required ?: false,
                    description = it.description
                )
            }.distinctBy { it.name },
            result = methodResultType,
            defaultParams = methodsSchema.fixedParams,
            description = methodsSchema.description
        )

        val typeId = nameMethod(methodsSchema.name, basePackage).copy(name = methodsSchema.className)
        typeSpace.registerTypeImplementation(typeId, methodType)
    }

    private fun makeMethodResultType(methodSchema: MethodSchema): TypeId? {
        val responseRef = methodSchema.responses.response.toJsonRef()
        val responseObject = responsesSchema.definitions[responseRef]!!.properties.response

        val needsVkListWrapping = responseObject is GeneralObject &&
                responseObject.properties.containsKey("items") &&
                responseObject.properties.containsKey("count") &&
                responseObject.properties.size == 2

        val items = if (responseObject is GeneralObject && needsVkListWrapping) {
            (responseObject.properties["items"] as ArrayObject).items
        } else {
            responseObject
        }

        val type = makeType(::nameResponse, responseRef, items) ?: return null
        val vkListWrapped = if (needsVkListWrapping) makeVkList(type) else type

        return makeVkMethod(vkListWrapped, makeMethodAccessType(methodSchema))
    }

    private fun makeArrayType(itemType: TypeId): TypeId {
        return TypeId("kotlin.collections.List", listOf(itemType))
    }

    private fun makeVkMethod(resultType: TypeId, methodRequirement: TypeId): TypeId {
        return TypeId("name.anton3.vkapi.method.VkMethod", listOf(resultType, methodRequirement))
    }

    private fun makeVkList(typeId: TypeId): TypeId {
        return TypeId("name.anton3.vkapi.vktypes.VkList", listOf(typeId))
    }

    private fun makeMethodAccessType(methodSchema: MethodSchema): TypeId {
        val interfacePackage = "name.anton3.vkapi.method"

        val tokenTypes = methodSchema.accessTokenType.toSet()
        val filteredTokenTypes = listOf("user", "group", "service").filter { tokenTypes.contains(it) }
        if (filteredTokenTypes.isEmpty()) return TypeId(interfacePackage, "MethodRequirement")

        val interfaceName = filteredTokenTypes.joinToString("", postfix = "Method") { it.capitalize() }

        return TypeId(interfacePackage, interfaceName)
    }

    private fun makeType(nameStrategy: NameStrategy, responseRef: JsonTypeRef, typeObject: Object?): TypeId? {
        if (typeObject == null) {
            logger.warn("Type $responseRef is undefined")
            return null
        }
        val alreadyDefined = typeSpace.resolveTypeIdByJsonRefOrNull(responseRef)

        if (alreadyDefined != null) {
            logger.debug("$responseRef already defined to $alreadyDefined")
            return alreadyDefined
        }

        return when (typeObject) {
            is SimpleObject -> typeSpace.resolveTypeIdByJsonRef(typeObject.type)
            is OneOfObject -> makeOneOfType(::nameObject, responseRef, typeObject)
            is AllOfObject -> makeAllOfType(::nameObject, responseRef, typeObject)
            is RefObject -> {
                val toJsonRef = typeObject.toJsonRef()
                val objDefinition = objectsSchema.definitions[toJsonRef]
                makeType(::nameObject, toJsonRef, objDefinition)
            }
            is SimpleObjectMultiType -> typeSpace.resolveTypeIdByJsonRef("string")
            is EnumObject -> makeEnumType(nameStrategy, responseRef, typeObject)
            is ArrayObject -> makeType(::nameObject, responseRef, typeObject.items)?.let {
                makeArrayType(it)
            }
            is GeneralObject -> makeTypeFromGeneralObject(nameStrategy, responseRef, typeObject)
            is ObjectWithPatternProperties -> makeMapResultType()
        }
    }

    private fun makeEnumType(
        nameStrategy: NameStrategy,
        responseRef: JsonTypeRef,
        typeObject: EnumObject
    ): TypeId {
        val typeIdByRef = typeSpace.resolveTypeIdByJsonRefOrNull(responseRef)
            ?.let { typeSpace.resolveTypeAliases(it) }

        if (typeIdByRef != null) return typeIdByRef

        val typeId = nameStrategy(responseRef, basePackage)
        if (typeSpace.definedTypes[typeId]?.fixedName == true)
            return typeId

        val type = EnumType.decodeTypeDefinition(typeObject.enum, typeObject.enumNames, typeObject.type == "integer")

        return if (type == BuiltinType)
            TypeId("kotlin.Boolean")
        else
            typeSpace.registerTypeImplementation(typeId, type)
    }

    private fun makeOneOfType(nameStrategy: NameStrategy, responseRef: JsonTypeRef, typeObject: OneOfObject): TypeId? {
        //для каждго ref - делаем сплит и родительскому интерфйесу добавляем в родители пустой маркер-интерфейс этого объекта
        val rootTypeId = nameStrategy(responseRef, basePackage)

        val rootType = ObjectType(
            props = emptyList(),
            kind = ObjectType.Kind.INTERFACE,
            description = typeObject.description
        )

        typeSpace.registerTypeReference(responseRef, rootTypeId)
        typeSpace.registerTypeImplementation(rootTypeId, rootType)

        typeObject.oneOf.forEach { item ->
            when (item) {
                is RefObject -> {
                    val refType = makeType(::nameObject, item.toJsonRef(), item)!!
                    typeSpace.addParentToType(refType, rootTypeId)
                }
                is GeneralObject -> {
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
        typeObject: AllOfObject
    ): TypeId? {
        //OneOf - игнорируем
        //для каждго ref - делаем сплит и добавляем свойства из него
        //для properties - просто получаем список свойств
        val ownProps = typeObject.allOf.filterIsInstance(GeneralObject::class.java)
            .flatMap { objectPropsToClassProps(it.properties, nameStrategy, responseRef, it.required) }.toSet().toList()

        val rootType = ObjectType(ownProps, kind = ObjectType.Kind.CLASS, description = typeObject.description)

        val rootTypeId = nameStrategy(responseRef, basePackage)
        typeSpace.registerTypeReference(responseRef, rootTypeId)
        typeSpace.registerTypeImplementation(rootTypeId, rootType)

        typeObject.allOf.filterIsInstance(RefObject::class.java)
            .map {
                val refObject = objectsSchema.definitions[it.toJsonRef()]
                makeType(::nameObject, it.toJsonRef(), refObject)
                    ?: error("Cant make ref type for ${it.toJsonRef()}")
            }.toSet().forEach { parentTypeId ->
                typeSpace.addParentToType(rootTypeId, parentTypeId)
            }


        val anyOf = typeObject.allOf.firstOrNull { it is OneOfObject } as? OneOfObject
        if (anyOf != null) {
            typeSpace.splitToInterfaceImplementationPairIfNeeded(rootTypeId)

            anyOf.oneOf.forEach { item ->
                when (item) {
                    is RefObject -> {
                        val refType = makeType(::nameObject, item.toJsonRef(), item)!!
                        typeSpace.addParentToType(refType, rootTypeId)
                    }

                    is GeneralObject -> {
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

    private fun makeTypeFromGeneralObject(
        nameStrategy: NameStrategy,
        responseRef: JsonTypeRef,
        typeObject: GeneralObject
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

        val definition = ObjectType(props, kind = ObjectType.Kind.CLASS, description = typeObject.description)

        return typeSpace.registerTypeImplementation(typeId, definition)
    }

    private fun objectPropsToClassProps(
        properties: Map<String, Object>,
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
                name in listOf("date", "timestamp", "update_time") && typeId.name == "Int" ->
                    TypeId("name.anton3.vkapi.vktypes.VkDate")
                name == "bdate" && typeId.name == "String" ->
                    TypeId("name.anton3.vkapi.vktypes.VkBirthDate")
                else -> typeId
            }

            Prop(
                name,
                finalType,
                propObj.inherited,
                nullable = !required.contains(name),
                description = propObj.description
            )
        }.map {
            it.copy(typeId = typeSpace.resolveTypeAliases(it.typeId))
        }
    }

    private fun makeMapResultType(): TypeId {
        val typeId = TypeId(
            qualifiedName = "kotlin.collections.Map",
            genericParameters = listOf(TypeId("kotlin.Int"), TypeId("kotlin.Boolean"))
        )

        return typeSpace.registerTypeImplementation(typeId, BuiltinType)
    }

    private fun resolveMethodParamToTypeId(methodName: String, param: MethodParameter): TypeId {
        return when {
            param.enum != null -> declareEnumFromParam(methodName, param)
            param.type == "array" -> makeArrayType(typeSpace.resolveTypeIdByJsonRef(param.items!!.type))
            else -> typeSpace.resolveTypeIdByJsonRef(param.type)
        }
    }

    private fun declareEnumFromParam(methodName: String, param: MethodParameter): TypeId {
        val parts = methodName.split(".")
        val nameCandidate = param.name
        val candidateTypeId = nameObject((parts + nameCandidate).joinToString("_"), basePackage)
        val enumValues = param.enum!!
        val enumNames = param.enumNames
        return defineEnumType(enumValues, enumNames, candidateTypeId, param.type == "integer")
    }

    private fun defineEnumType(
        enumValues: List<String>,
        enumNames: List<String>?,
        expectedTypeId: TypeId,
        isInteger: Boolean
    ): TypeId {
        val definition = EnumType.decodeTypeDefinition(enumValues, enumNames, isInteger)
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
        typeSpace.registerBuiltin("java.lang.Void")
        typeSpace.registerBuiltin("kotlin.collections.List")
        typeSpace.registerBuiltin("kotlin.collections.Map")
        typeSpace.registerBuiltin("com.fasterxml.jackson.databind.annotation.JsonDeserialize")
        typeSpace.registerBuiltin("com.fasterxml.jackson.annotation.JsonCreator")
        typeSpace.registerBuiltin("com.fasterxml.jackson.annotation.JsonValue")
        typeSpace.registerBuiltin("com.fasterxml.jackson.module.kotlin.jacksonTypeRef")
        typeSpace.registerBuiltin("name.anton3.vkapi.vktypes.VkDate")
        typeSpace.registerBuiltin("name.anton3.vkapi.vktypes.VkList")
        typeSpace.registerBuiltin("name.anton3.vkapi.vktypes.VkBirthDate")
        typeSpace.registerBuiltin("name.anton3.vkapi.method.VkMethod")
        typeSpace.registerBuiltin("name.anton3.vkapi.method.MethodRequirement")
        typeSpace.registerBuiltin("name.anton3.vkapi.method.UserMethod")
        typeSpace.registerBuiltin("name.anton3.vkapi.method.ServiceMethod")
        typeSpace.registerBuiltin("name.anton3.vkapi.method.UserGroupMethod")
        typeSpace.registerBuiltin("name.anton3.vkapi.method.UserServiceMethod")
        typeSpace.registerBuiltin("name.anton3.vkapi.method.UserGroupServiceMethod")
        typeSpace.registerBuiltin("name.anton3.vkapi.vktypes.Value")
        typeSpace.registerBuiltin("name.anton3.vkapi.vktypes.parseEnum")

        // Primitive schema types
        typeSpace.registerVkPrimitiveType("integer", "kotlin.Int")
        typeSpace.registerVkPrimitiveType("string", "kotlin.String")
        typeSpace.registerVkPrimitiveType("boolean", "kotlin.Boolean")
        typeSpace.registerVkPrimitiveType("number", "kotlin.Double")

        // Redefine some schema types to better representations
        typeSpace.registerVkPrimitiveType("base_bool_int", "name.anton3.vkapi.vktypes.BoolInt")
        typeSpace.registerVkPrimitiveType("base_property_exists", "name.anton3.vkapi.vktypes.PropertyExists")
        typeSpace.registerVkPrimitiveType("base_ok_response", "name.anton3.vkapi.vktypes.OkResponse")
    }

    private fun deleteOldAndRecreate(absPath: Path) {
        Files.createDirectories(absPath)
        Files.walk(absPath).asSequence().map(Path::toFile).sortedDescending().forEach { it.delete() }
        Files.createDirectories(absPath)
    }

    fun resolveMethod(methodId: String) {
        defineCommonTypes()
        val normalizedMethods = methodsSchema.methods
            .filter { it.name == methodId }
            .mapNotNull { normalizeMethodDefinition(it) }
            .flatten()
            .filter { responseSchemaIsDefined(it.responses.response) }

        logger.info("Normalized  methods: ${normalizedMethods.size}")
        normalizedMethods.forEach(this::makeMethod)
    }

    private fun concatenatePackage(packagePath: String, fileName: String): String {
        return if (packagePath.last() == '/') "$packagePath$fileName" else "$packagePath/$fileName"
    }

    private fun loadPatchesFromFiles(patchFileNames: List<String>, patchPackage: String) {
        patchFileNames.forEach { fileName ->
            val jsonString = readTextFromFile(concatenatePackage(patchPackage, fileName))
            val patch: Patch = OBJECT_MAPPER.readValue(jsonString)
            methodsSchema.methods.removeIf { patch.methods.any { p -> p.name == it.name } }
            methodsSchema.methods += patch.methods

            responsesSchema.definitions.putAll(patch.responses)
            objectsSchema.definitions.putAll(patch.objects)
        }
    }

    fun loadPatchesFromPackage(patchPackage: String) {
        val packageWithSlash = concatenatePackage(patchPackage, "")
        val packageResource = Thread.currentThread().contextClassLoader.getResourceAsStream(packageWithSlash)
            ?: String::class.java.getResourceAsStream(packageWithSlash) ?: error("Package $patchPackage not found")
        val fileNames = packageResource.use { it.reader().buffered().readLines() }
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

private val OBJECT_MAPPER = ObjectMapper().registerModule(KotlinModule())
