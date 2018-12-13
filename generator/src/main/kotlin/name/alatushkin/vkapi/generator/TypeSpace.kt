package name.alatushkin.vkapi.generator

import mu.KotlinLogging
import name.alatushkin.vkapi.generator.source.*

private val log = KotlinLogging.logger {}

class TypeSpace {
    private val typeReferences = mutableMapOf<JsonTypeRef, TypeId>()
    val definedTypes = mutableMapOf<TypeId, TypeDefinition>()
    private val typeAliases = mutableMapOf<TypeId, TypeId>()
    val interfaceImplementations = mutableSetOf<Pair<TypeId, TypeId>>()

    val typesCount: Int get() = definedTypes.size

    fun splitToInterfaceImplementationPairIfNeeded(typeId: TypeId): TypeId {
        val type = definedTypes[resolveTypeAliases(typeId)]

        require(type is ObjectType) { "Only ObjectType can be split" }
        if (type.kind == ObjectType.Kind.INTERFACE) {
            log.debug("$typeId is already split")
            return typeId
        }

        val implTypeId = typeId.copy(name = typeId.name + "Impl")
        if (definedTypes[resolveTypeAliases(implTypeId)] != null) {
            log.debug("$typeId is already split")
            return typeId
        }

        val implType = type.copy(
            props = type.props.map { it.copy(inherited = true) },
            parents = setOf(typeId),
            kind = ObjectType.Kind.CLASS
        )

        val interfaceType = type.copy(
            kind = ObjectType.Kind.INTERFACE
        )

        registerTypeImplementation(implTypeId, implType)
        replaceTypeImplementation(typeId, interfaceType)

        interfaceImplementations.add(typeId to implTypeId)

        return typeId
    }

    fun renameType(oldTypeId: TypeId, newTypeId: TypeId): TypeId {
        if (oldTypeId == newTypeId) return oldTypeId

        log.debug("Rename $oldTypeId to $newTypeId")

        typeAliases[oldTypeId] = newTypeId
        val definition = definedTypes.remove(oldTypeId)!!

        registerTypeImplementation(newTypeId, definition)
        return newTypeId
    }

    fun registerType(jsonRef: JsonTypeRef, typeId: TypeId, type: TypeDefinition): TypeId {
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
            log.warn("Collision with name $typeId. New: $type; Old: $oldObject")
        }
        return replaceTypeImplementation(typeId, type)
    }

    private fun replaceTypeImplementation(typeId: TypeId, type: TypeDefinition): TypeId {
        definedTypes[typeId] = type
        return typeId
    }

    fun printDefinedTypesNames() {
        definedTypes.map { it.key.qualifiedName() }.sorted().forEach { log.debug(it) }
    }

    fun resolveTypeIdByJsonRef(jsonRef: JsonTypeRef): TypeId {
        val typeId = typeReferences[jsonRef] ?: error("Unknown type for jsonReference $jsonRef")
        return resolveTypeAliases(typeId)
    }

    fun resolveTypeAliases(typeId: TypeId): TypeId {
        val preResult = typeAliases[typeId]?.let { resolveTypeAliases(it) } ?: typeId
        return preResult.copy(genericParameters = preResult.genericParameters.map { resolveTypeAliases(it) })
    }

    fun registerBuiltin(qualifiedName: String) {
        registerTypeImplementation(TypeId(qualifiedName), BuiltinType)
    }

    fun registerVkPrimitiveType(jsonRef: JsonTypeRef, qualifiedName: String) {
        registerType(jsonRef, TypeId(qualifiedName), BuiltinType)
    }

    fun resolveTypeIdByJsonRefOrNull(ref: JsonTypeRef): TypeId? {
        val typeId = typeReferences[ref] ?: return null
        return resolveTypeAliases(typeId)
    }

    fun addParentToType(typeId: TypeId, parentTypeId: TypeId) {
        val type = definedTypes[typeId]!! as ObjectType
        val parentType = definedTypes[parentTypeId]!! as ObjectType

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

    private fun normalizeTypeIds(list: List<ObjectType.Prop>): List<ObjectType.Prop> {
        return list.map { it.copy(typeId = resolveTypeAliases(it.typeId)) }
    }
}
