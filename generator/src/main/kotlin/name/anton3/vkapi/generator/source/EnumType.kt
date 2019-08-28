package name.anton3.vkapi.generator.source

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value

data class EnumType(val items: List<Item>, val isInteger: Boolean) : TypeDefinition {

    data class Item(val name: String, val value: String)

    override val fixedName: Boolean get() = false
    override val hasSource: Boolean get() = true

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        sourceWriter.importType(TypeId<JsonCreator>())
        sourceWriter.importType(TypeId<JsonValue>())
        sourceWriter.importType(TypeId<Value<*>>())
        sourceWriter.importType(TypeId<Int>())
        sourceWriter.importType(TypeId<String>())
        sourceWriter.importType(TypeId("name.anton3.vkapi.vktypes.parseEnum"))

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
