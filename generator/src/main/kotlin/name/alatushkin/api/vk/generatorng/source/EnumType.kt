package name.alatushkin.api.vk.generatorng.source

import name.alatushkin.api.vk.generatorng.source.writer.SourceWriter

data class EnumType(val items: List<Item>) : TypeDefinition {

    data class Item(val name: String, val value: String)

    override val fixedName: Boolean get() = false
    override val hasSource: Boolean get() = true

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        sourceWriter.importType(TypeId("com.fasterxml.jackson.annotation.JsonCreator"))
        sourceWriter.importType(TypeId("com.fasterxml.jackson.annotation.JsonValue"))

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        val itemsClause = items.joinToString(",\n    ") { item ->
            sourceWriter.enumItem(item.name, item.value)
        }

        return """
            |$packageClause$importClause
            |
            |enum class ${typeId.name}(@JsonValue val jsonValue: String) {
            |    $itemsClause;
            |
            |    override fun toString() = jsonValue
            |
            |    companion object {
            |        @JvmStatic
            |        @JsonCreator
            |        fun fromJsonValue(value: String): ${typeId.name} =
            |            ${typeId.name}.values().find { it.jsonValue == value }!!
            |    }
            |}
        """.trimMargin()
    }

    companion object {
        fun define(values: Map<String, String>): TypeDefinition {
            val sortedValues = values.entries.sortedBy { it.key }
            return decodeTypeDefinitionInternal(
                sortedValues.map { it.key },
                sortedValues.map { it.value }
            )
        }

        fun decodeTypeDefinition(
            values: List<String>,
            names: List<String>?
        ): TypeDefinition {
//            if (isSameAsBoolean(values))
//                return BuiltinType
            return decodeTypeDefinitionInternal(values, names)
        }

        private fun decodeTypeDefinitionInternal(
            values: List<String>,
            names: List<String>?
        ): TypeDefinition {
            val items = (names ?: values)
                .zip(values)
                .map { (name, value) -> Item(name, value) }

            return EnumType(items)
        }
    }
}
