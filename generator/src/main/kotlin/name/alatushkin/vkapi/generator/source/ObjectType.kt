package name.alatushkin.vkapi.generator.source

import name.alatushkin.vkapi.generator.source.writer.SourceWriter
import name.alatushkin.vkapi.generator.source.writer.invoke

data class ObjectType(
        val props: List<Prop>,
        val kind: Kind = Kind.CLASS,
        val parents: Set<TypeId> = emptySet()
) : TypeDefinition {

    enum class Kind {
        CLASS, INTERFACE
    }

    data class Prop(
        val name: String,
        val typeId: TypeId,
        val inherited: Boolean = false,
        val nullable: Boolean = true
    ) {
        override fun toString(): String {
            return "${inherited("override ")}$name:${typeId.fullName()}${nullable("?")}"
        }
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

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        val builder = StringBuilder()
        builder.append("$packageClause$importClause\n\n")

        builder.append(
            when {
                kind == Kind.INTERFACE -> "interface"
                props.isEmpty() -> "class"
                else -> "data class"
            }
        )

        builder.append(" ${typeId.name}")

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
}
