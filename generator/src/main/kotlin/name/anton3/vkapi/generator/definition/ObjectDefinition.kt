package name.anton3.vkapi.generator.definition

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generator.source.SourceWriter
import name.anton3.vkapi.generator.source.TypeId
import name.anton3.vkapi.generator.source.joinIfNotEmpty

data class Prop(
    val name: String,
    val typeId: TypeId,
    val inherited: Boolean,
    val nullable: Boolean,
    val description: String?
)

data class ObjectDefinition(
    val props: List<Prop>,
    val kind: Kind,
    val parents: Set<TypeId> = emptySet(),
    val implementation: TypeId? = null,
    val description: String?
) : Definition {

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

        val parentClause = parents.joinIfNotEmpty(", ", prefix = " : ") { arg ->
            sourceWriter.parentType(arg)
        }

        val implType = implementation ?: TypeId<Void>().takeIf { parents.isNotEmpty() }
        val implClause = implType?.let {
            sourceWriter.importType(TypeId<JsonDeserialize>())
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

        builder.append(
            """
            |@file:Suppress("unused", "SpellCheckingInspection")
            |
            |$packageClause$importClause
            |
            |$description
            |$implClause$definitionKeyword ${typeId.name}
            """.trimMargin()
        )

        if (kind == Kind.INTERFACE) {
            builder.append(parentClause)
        }

        if (props.isNotEmpty()) {
            if (kind == Kind.INTERFACE) {
                builder.append(" {\n")
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
        val propertyDescriptions = props.joinIfNotEmpty("\n", prefix = "\n *\n") { arg ->
            " * @property ${sourceWriter.fieldName(arg.name)} ${arg.description?.trim() ?: "No description"}"
        }

        return """
        |/**
        | * ${description ?: "No description"}$propertyDescriptions
        | */
        """.trimMargin()
    }
}
