package name.anton3.vkapi.generator.source

data class Prop(
    val name: String,
    val typeId: TypeId,
    val inherited: Boolean,
    val nullable: Boolean,
    val description: String?
)

data class ObjectType(
    val props: List<Prop>,
    val kind: Kind,
    val parents: Set<TypeId> = emptySet(),
    val implementation: TypeId? = null,
    val description: String?
) : TypeDefinition {

    enum class Kind {
        CLASS, INTERFACE
    }

    override val fixedName: Boolean get() = false
    override val hasSource: Boolean get() = true

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {
        val defaultValue = if (kind == Kind.INTERFACE) null else "null"

        val delimiter = if (kind == Kind.INTERFACE) "\n" else ",\n"

        val constructorArgs = props.joinToString(delimiter) { arg ->
            sourceWriter.constructorField(
                name = arg.name,
                type = arg.typeId,
                inherited = arg.inherited,
                nullable = arg.nullable,
                final = true,
                defaultValue = defaultValue.takeIf { arg.nullable },
                delegateBy = null
            )
        }

        val parentTypes = parents.joinToString(",\n    ") { arg ->
            sourceWriter.parentType(arg)
        }
        val parentClause = parents.isNotEmpty()(" : $parentTypes")

        val implType = implementation ?: TypeId("java.lang.Void").takeIf { parents.isNotEmpty() }
        val implClause = implType?.let {
            sourceWriter.importType(TypeId("com.fasterxml.jackson.databind.annotation.JsonDeserialize"))
            sourceWriter.importType(implType)
            "@JsonDeserialize(`as` = ${implType.name}::class)\n"
        }.orEmpty()

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        val description = renderDescription(sourceWriter)

        val definitionKeyword = when {
            kind == Kind.INTERFACE -> "interface"
            props.isEmpty() -> "class"
            else -> "data class"
        }

        val builder = StringBuilder()

        builder.append("$packageClause$importClause\n\n$description\n$implClause$definitionKeyword ${typeId.name}")

        if (kind == Kind.INTERFACE) {
            builder.append(parentClause)
        }

        if (props.isNotEmpty()) {
            if (kind == Kind.INTERFACE) {
                builder.append(" {\n")
                if (parents.size > 1) builder.append("\n")
            } else {
                builder.append("(\n")
            }

            builder.append(constructorArgs)

            if (kind == Kind.INTERFACE) {
                builder.append("\n}")
            } else {
                builder.append("\n)")
            }
        }

        if (kind != Kind.INTERFACE) {
            builder.append(parentClause)
        }

        return builder.toString()
    }

    private fun renderDescription(sourceWriter: SourceWriter): String {
        val propertyDescriptions = props.joinToString("\n") { arg ->
            " * @property ${sourceWriter.fieldName(arg.name)} ${arg.description?.trim() ?: "No description"}"
        }

        return """
        |/**
        | * ${description ?: "No description"}
        | *
        |$propertyDescriptions
        | */
        """.trimMargin()
    }
}
