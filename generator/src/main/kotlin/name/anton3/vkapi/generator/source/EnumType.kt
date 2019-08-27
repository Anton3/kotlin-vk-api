package name.anton3.vkapi.generator.source

data class EnumType(val items: List<Item>, val isInteger: Boolean) : TypeDefinition {

    data class Item(val name: String, val value: String)

    override val fixedName: Boolean get() = false
    override val hasSource: Boolean get() = true

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        sourceWriter.importType(TypeId("com.fasterxml.jackson.annotation.JsonCreator"))
        sourceWriter.importType(TypeId("com.fasterxml.jackson.annotation.JsonValue"))
        sourceWriter.importType(TypeId("name.anton3.vkapi.vktypes.Value"))
        sourceWriter.importType(TypeId("name.anton3.vkapi.vktypes.parseEnum"))
        sourceWriter.importType(TypeId("kotlin.Int"))
        sourceWriter.importType(TypeId("kotlin.String"))

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        val itemsClause = items.joinToString(",\n    ") { item ->
            sourceWriter.enumItem(item.name, item.value, isInteger)
        }

        val valueClass = if (isInteger) "Int" else "String"

        return """
            |$packageClause$importClause
            |
            |enum class ${typeId.name}(@JsonValue override val value: $valueClass) : Value<$valueClass> {
            |    $itemsClause;
            |
            |    companion object {
            |        @JvmStatic
            |        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
            |        fun parse(value: $valueClass): ${typeId.name} = parseEnum(value)
            |    }
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
