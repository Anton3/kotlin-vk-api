package name.anton3.vkapi.generator.source

import name.anton3.vkapi.vktypes.ValueEnum

data class EnumType(val items: List<Item>, val isInteger: Boolean) : TypeDefinition {

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
        fun decodeTypeDefinition(values: List<String>, names: List<String>?, isInteger: Boolean): TypeDefinition {
            val items = (names ?: values).zip(values).map { (name, value) -> Item(name, value) }
            return EnumType(items, isInteger)
        }
    }
}
