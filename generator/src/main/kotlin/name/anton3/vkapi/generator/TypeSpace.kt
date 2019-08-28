package name.anton3.vkapi.generator

import name.anton3.vkapi.generator.source.*
import org.apache.logging.log4j.kotlin.Logging

class TypeSpace {

    companion object : Logging

    private val typeReferences: MutableMap<JsonTypeRef, TypeId> = HashMap()
    val definedTypes: MutableMap<TypeId, TypeDefinition> = HashMap()
    private val typeAliases: MutableMap<TypeId, TypeId> = HashMap()
    val interfaceImplementations: MutableSet<Pair<TypeId, TypeId>> = HashSet()

    val typesCount: Int get() = definedTypes.size

    fun splitToInterfaceImplementationPairIfNeeded(typeId: TypeId) {
        val type = definedTypes[resolveTypeAliases(typeId)]

        require(type is ObjectType) { "Only ObjectType can be split" }

        if (type.kind == ObjectType.Kind.INTERFACE) {
            logger.debug("$typeId is already split")
            return
        }

        val implTypeId = typeId.copy(name = typeId.name + "Impl")
        if (definedTypes[resolveTypeAliasesUnchecked(implTypeId)] != null) {
            logger.debug("$typeId is already split")
            return
        }

        val implType = type.copy(
            props = type.props.map { it.copy(inherited = true) },
            parents = setOf(typeId),
            kind = ObjectType.Kind.CLASS
        )

        val interfaceType = type.copy(
            kind = ObjectType.Kind.INTERFACE,
            implementation = implTypeId
        )

        registerTypeImplementation(implTypeId, implType)
        replaceTypeImplementation(typeId, interfaceType)

        interfaceImplementations.add(typeId to implTypeId)
    }

    fun renameType(oldTypeId: TypeId, newTypeId: TypeId): TypeId {
        if (oldTypeId == newTypeId) return oldTypeId

        logger.debug("Rename $oldTypeId to $newTypeId")

        typeAliases[oldTypeId] = newTypeId
        val definition = definedTypes.remove(oldTypeId)!!

        registerTypeImplementation(newTypeId, definition)
        return newTypeId
    }

    private fun registerType(jsonRef: JsonTypeRef, typeId: TypeId, type: TypeDefinition): TypeId {
        registerTypeReference(jsonRef, typeId)
        registerTypeImplementation(typeId, type)
        return typeId
    }

    fun registerTypeReference(jsonRef: JsonTypeRef, typeId: TypeId) {
        if (typeReferences.containsKey(jsonRef) && typeReferences[jsonRef] != typeId) {
            error("Try to redefine jsonReference: $jsonRef from ${typeReferences[jsonRef]} to $typeId")
        }
        typeReferences[jsonRef] = typeId
    }

    fun registerTypeImplementation(typeId: TypeId, type: TypeDefinition): TypeId {
        val oldObject = definedTypes[typeId]
        if (definedTypes.containsKey(typeId) && oldObject != type) {
            logger.warn("Collision with name $typeId. New: $type; Old: $oldObject")
        }
        return replaceTypeImplementation(typeId, type)
    }

    private fun replaceTypeImplementation(typeId: TypeId, type: TypeDefinition): TypeId {
        definedTypes[typeId] = type
        return typeId
    }

    fun printDefinedTypesNames() {
        definedTypes.map { it.key.qualifiedName() }.sorted().forEach { logger.debug(it) }
    }

    fun resolveTypeIdByJsonRef(jsonRef: JsonTypeRef): TypeId {
        val typeId = typeReferences[jsonRef] ?: error("Unknown type for jsonReference $jsonRef")
        return resolveTypeAliases(typeId)
    }

    private fun resolveTypeAliasesUnchecked(typeId: TypeId): TypeId {
        val preResult = typeAliases[typeId]?.let { resolveTypeAliases(it) } ?: typeId
        return preResult.copy(genericParameters = preResult.genericParameters.map { resolveTypeAliases(it) })
    }

    fun resolveTypeAliases(typeId: TypeId): TypeId {
        val result = resolveTypeAliasesUnchecked(typeId)

        result.allWildcardGenerics().filter { it !in definedTypes }.forEach {
            logger.info("Type $it is not defined, but may get defined later")
        }

        return result
    }

    fun registerBuiltin(qualifiedName: String) {
        registerTypeImplementation(TypeId(qualifiedName), BuiltinType)
    }

    inline fun <reified T> registerBuiltin() {
        registerBuiltin(T::class.qualifiedName!!)
    }

    fun registerVkPrimitiveType(jsonRef: JsonTypeRef, qualifiedName: String) {
        registerType(jsonRef, TypeId(qualifiedName), BuiltinType)
    }

    inline fun <reified T> registerVkPrimitiveType(jsonRef: JsonTypeRef) {
        registerVkPrimitiveType(jsonRef, T::class.qualifiedName!!)
    }

    fun resolveTypeIdByJsonRefOrNull(ref: JsonTypeRef): TypeId? {
        val typeId = typeReferences[ref] ?: return null
        return resolveTypeAliases(typeId)
    }

    fun addParentToType(typeId: TypeId, parentTypeId: TypeId) {
        val type = definedTypes[typeId] as ObjectType
        val parentType = definedTypes[parentTypeId] as ObjectType

        splitToInterfaceImplementationPairIfNeeded(parentTypeId)

        replaceTypeImplementation(
            typeId,
            type.copy(
                parents = type.parents + parentTypeId,
                props = (normalizeTypeIds(type.props).toSet() + normalizeTypeIds(parentType.props).map {
                    it.copy(
                        inherited = true
                    )
                }.toSet()).toList()
            )
        )
    }

    private fun normalizeTypeIds(list: List<Prop>): List<Prop> {
        return list.map { it.copy(typeId = resolveTypeAliases(it.typeId)) }
    }
}
