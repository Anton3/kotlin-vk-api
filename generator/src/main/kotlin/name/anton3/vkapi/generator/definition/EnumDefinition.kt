package name.anton3.vkapi.generator.definition

import name.anton3.vkapi.generator.source.SourceWriter
import name.anton3.vkapi.generator.source.TypeId
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

    companion object {
        fun decodeTypeDefinition(values: List<String>, names: List<String>?, isInteger: Boolean): Definition {
            // TODO
            if (isSameAsBoolean(values) && false) return BuiltinDefinition
            val items = (names ?: values).zip(values).map { (name, value) -> Item(name, value) }
            return EnumDefinition(items, isInteger)
        }

        private fun isSameAsBoolean(values: List<String>): Boolean {
            return values.toSet() in listOf(setOf("1"), setOf("0", "1"))
        }
    }
}
