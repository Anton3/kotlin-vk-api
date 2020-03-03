package name.anton3.vkapi.generator.definition

import name.anton3.vkapi.generator.json.EnumType
import name.anton3.vkapi.generator.json.NodeType
import name.anton3.vkapi.generator.source.SourceWriter
import name.anton3.vkapi.generator.source.TypeId
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.PropertyExists
import name.anton3.vkapi.vktypes.ValueEnum

data class EnumDefinition(val items: List<Item>, val isInteger: Boolean) : Definition {

    data class Item(val name: String, val value: String)

    override val fixedName: Boolean get() = false
    override val hasSource: Boolean get() = true

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        val valueType = if (isInteger) TypeId<Int>() else TypeId<String>()
        sourceWriter.importType(valueType)
        sourceWriter.importType(TypeId<ValueEnum<*>>(valueType))

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        val itemsClause = items.joinToString(",\n    ") { item ->
            sourceWriter.enumItem(item.name, item.value, isInteger)
        }

        val valueClass = if (isInteger) "Int" else "String"

        return """
            |@file:Suppress("unused", "SpellCheckingInspection")
            |
            |$packageClause$importClause
            |
            |enum class ${typeId.name}(override val value: $valueClass) : ValueEnum<$valueClass> {
            |    $itemsClause
            |}
        """.trimMargin()
    }

    fun isEquivalent(other: Definition): Boolean {
        return other is EnumDefinition &&
                isInteger == other.isInteger &&
                items.sortedBy { it.name } == other.items.sortedBy { it.name }
    }

    fun equivalentBuiltin(): TypeId? {
        return when (items.associate { it.name to it.value }) {
            NO_YES_ITEMS -> TypeId<BoolInt>()
            OK_ITEMS -> TypeId<PropertyExists>()
            else -> null
        }
    }

    companion object {
        fun decodeTypeDefinition(typeObject: EnumType): EnumDefinition {
            return EnumDefinition(
                items = (typeObject.enumNames ?: typeObject.enum).zip(typeObject.enum, ::Item),
                isInteger = typeObject.type == NodeType.INTEGER
            )
        }

        private val NO_YES_ITEMS: Map<String, String> = mapOf("no" to "0", "yes" to "1")
        private val OK_ITEMS: Map<String, String> = mapOf("ok" to "1")
    }
}
