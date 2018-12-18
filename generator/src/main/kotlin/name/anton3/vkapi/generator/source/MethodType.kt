package name.anton3.vkapi.generator.source

data class MethodArgument(
    val typeId: TypeId,
    val name: String,
    val required: Boolean,
    val description: String?
)

data class MethodType(
    val methodUrl: String,
    val arguments: List<MethodArgument>,
    val result: TypeId,
    val defaultParams: Map<String, String?> = emptyMap(),
    val methodAccessType: TypeId?,
    val description: String?
) : TypeDefinition {

    class Item(val name: String, val value: String)

    override val fixedName: Boolean get() = false
    override val hasSource: Boolean get() = true

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        val baseFields = setOf("access_token", "client_secret", "v", "lang", "test_mode")

        val filteredArguments = arguments.filter { it.name !in baseFields }
        val hasParams = filteredArguments.isNotEmpty()

        val fieldsDefinition = filteredArguments.joinToString(",\n", prefix = "\n", postfix = "\n") { arg ->
            sourceWriter.constructorField(
                name = arg.name,
                type = arg.typeId,
                inherited = arg.name in baseFields,
                final = false,
                nullable = !arg.required,
                delegateBy = null,
                defaultValue = if (arg.required) null else "null"
            )
        }

        val implementsClause = methodAccessType?.let {
            sourceWriter.importType(it)
            ",\n    ${it.name}"
        }.orEmpty()

        val classRef = renderClassRef(sourceWriter)
        val description = renderDescription(sourceWriter)

        val parentClass = sourceWriter.parentType(result)

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        val dataClass = hasParams("data ")

        val builder = StringBuilder()

        builder.append(
            """
            |@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")
            |
            |$packageClause$importClause
            |
            |$description
            |${dataClass}class ${typeId.name}${hasParams("($fieldsDefinition)")} : $parentClass("$methodUrl", $classRef)$implementsClause
            """.trimMargin()
        )

        renderMutableMap(defaultParams)

        val filteredDefaultParams = defaultParams
            .mapNotNull { (key, value) -> value?.let { key to value } }

        if (filteredDefaultParams.isNotEmpty()) {
            val constructorBody = filteredDefaultParams
                .joinToString("\n        ") { (key, value) -> """unsafeParam("$key", "$value")""" }

            builder.append(
                """ {
                |    init {
                |        $constructorBody
                |    }
                |}
                """.trimMargin()
            )
        }

        return builder.toString()
    }

    private fun renderClassRef(sourceWriter: SourceWriter): String {
        sourceWriter.importType(TypeId("com.fasterxml.jackson.module.kotlin.jacksonTypeRef"))
        return "jacksonTypeRef()"
    }

    private fun renderMutableMap(map: Map<String, String?>): String {
        return map.filterValues { it != null }.entries.joinToString(", ", prefix = "mutableMapOf(", postfix = ")") { "\"${it.key}\" to \"${it.value!!}\"" }
    }

    private fun renderDescription(sourceWriter: SourceWriter): String {
        val propertyDescriptions = arguments.joinToString("\n") { arg ->
            " * @property ${sourceWriter.fieldName(arg.name)} ${arg.description?.trim() ?: "No description"}"
        }

        return """
        |/**
        | * [https://vk.com/dev/$methodUrl]
        | *
        | * ${description ?: "No description"}
        | *
        |$propertyDescriptions
        | */
        """.trimMargin()
    }
}
