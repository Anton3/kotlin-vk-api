package name.anton3.vkapi.generator

import name.anton3.vkapi.generator.definition.BuiltinDefinition
import name.anton3.vkapi.generator.definition.Definition
import name.anton3.vkapi.generator.definition.ObjectDefinition
import name.anton3.vkapi.generator.definition.Prop
import name.anton3.vkapi.generator.source.JsonTypeRef
import name.anton3.vkapi.generator.source.TypeId
import name.anton3.vkapi.generator.source.allWildcardGenerics
import org.apache.logging.log4j.kotlin.Logging

class TypeSpace {

    companion object : Logging

    private val typeReferences: MutableMap<JsonTypeRef, TypeId> = HashMap()
    val definedTypes: MutableMap<TypeId, Definition> = HashMap()
    private val typeAliases: MutableMap<TypeId, TypeId> = HashMap()
    val interfaceImplementations: MutableSet<Pair<TypeId, TypeId>> = HashSet()

    val typesCount: Int get() = definedTypes.size

    fun splitToInterfaceImplementationPairIfNeeded(typeId: TypeId) {
        val type = definedTypes[resolveTypeAliases(typeId)]

        require(type is ObjectDefinition) { "Only ObjectType can be split" }

        if (type.kind == ObjectDefinition.Kind.INTERFACE) {
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
            kind = ObjectDefinition.Kind.CLASS
        )

        val interfaceType = type.copy(
            kind = ObjectDefinition.Kind.INTERFACE,
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

    private fun registerType(jsonRef: JsonTypeRef, typeId: TypeId, type: Definition): TypeId {
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

    fun registerTypeImplementation(typeId: TypeId, type: Definition): TypeId {
        val oldObject = definedTypes[typeId]
        if (definedTypes.containsKey(typeId) && oldObject != type) {
            logger.warn("Collision with name $typeId. New: $type; Old: $oldObject")
        }
        return replaceTypeImplementation(typeId, type)
    }

    private fun replaceTypeImplementation(typeId: TypeId, type: Definition): TypeId {
        definedTypes[typeId] = type
        return typeId
    }

    fun logDefinedTypeNames() {
        definedTypes.map { it.key.qualifiedName() }.sorted().forEach { logger.debug(it) }
    }

    fun resolveTypeIdByJsonRef(jsonRef: JsonTypeRef): TypeId {
        val typeId = typeReferences[jsonRef] ?: error("Unknown type for jsonReference $jsonRef")
        return resolveTypeAliases(typeId)
    }

    fun resolveTypeIdByJsonRefOrNull(ref: JsonTypeRef): TypeId? {
        val typeId = typeReferences[ref] ?: return null
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
        registerTypeImplementation(TypeId(qualifiedName), BuiltinDefinition)
    }

    inline fun <reified T> registerBuiltin() {
        registerBuiltin(T::class.qualifiedName!!)
    }

    fun registerVkPrimitiveType(jsonRef: JsonTypeRef, qualifiedName: String) {
        registerType(jsonRef, TypeId(qualifiedName), BuiltinDefinition)
    }

    inline fun <reified T> registerVkPrimitiveType(jsonRef: JsonTypeRef) {
        registerVkPrimitiveType(jsonRef, T::class.qualifiedName!!)
    }

    fun addParentToType(typeId: TypeId, parentTypeId: TypeId) {
        val type = definedTypes[typeId] as ObjectDefinition
        val parentType = definedTypes[parentTypeId] as ObjectDefinition

        splitToInterfaceImplementationPairIfNeeded(parentTypeId)

        val ownProps = normalizeTypeIds(type.props).associateByTo(mutableMapOf()) { it.name }
        val parentProps = normalizeTypeIds(parentType.props).associateBy { it.name }

        for ((name, parentProp) in parentProps) {
            val ownProp = ownProps[name]

            val mergedProp = if (ownProp == null) {
                parentProp.copy(inherited = true)
            } else {
                require(ownProp.typeId == parentProp.typeId) {
                    "$typeId has multiple different props with name $name"
                }

                Prop(
                    name = name,
                    typeId = ownProp.typeId,
                    inherited = true,
                    nullable = ownProp.nullable && parentProp.nullable,
                    description = ownProp.description ?: parentProp.description
                )
            }

            ownProps[name] = mergedProp
        }

        replaceTypeImplementation(
            typeId,
            type.copy(
                parents = type.parents + parentTypeId,
                props = ownProps.values.toList()
            )
        )
    }

    private fun normalizeTypeIds(list: List<Prop>): List<Prop> {
        return list.map { it.copy(typeId = resolveTypeAliases(it.typeId)) }
    }
}
