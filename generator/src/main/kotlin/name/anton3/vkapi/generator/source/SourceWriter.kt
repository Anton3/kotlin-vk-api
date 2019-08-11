package name.anton3.vkapi.generator.source

import name.anton3.vkapi.generator.TypeSpace
import name.anton3.vkapi.generator.under2camel

interface SourceWriter {
    fun constructorField(
        name: String,
        type: TypeId,
        inherited: Boolean = false,
        final: Boolean = true,
        nullable: Boolean,
        defaultValue: String?,
        delegateBy: String?
    ): String

    fun argument(
        name: String,
        type: TypeId,
        nullable: Boolean,
        defaultValue: String?
    ): String

    fun parentType(type: TypeId): String

    fun enumItem(name: String, vararg values: String): String

    fun importClause(currentTypeId: TypeId): String

    fun copy(): SourceWriter

    fun packageClause(typeId: TypeId): String

    fun fieldName(name: String): String

    fun fieldNameEscaped(name: String): String

    fun realType(typeId: TypeId): TypeId

    fun importType(importedTypeId: TypeId)
}

fun <T> Collection<T>.joinIfNotEmpty(
    separator: CharSequence = ", ",
    prefix: CharSequence = "",
    postfix: CharSequence = "",
    limit: Int = -1,
    truncated: CharSequence = "...",
    transform: ((T) -> CharSequence)? = null
): String =
    if (isEmpty()) "" else joinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString()

class KotlinSourceWriter(private val typeSpace: TypeSpace) : SourceWriter {

    private val referencedTypes = HashSet<TypeId>()

    override fun constructorField(
        name: String,
        type: TypeId,
        inherited: Boolean,
        final: Boolean,
        nullable: Boolean,
        defaultValue: String?,
        delegateBy: String?
    ): String {
        return "    " +
                (if (inherited) "override " else "") +
                (if (final) "val " else "var ") +
                argument(name, type, nullable, defaultValue) +
                (delegateBy?.let { " by $it" } ?: "")
    }

    override fun argument(name: String, type: TypeId, nullable: Boolean, defaultValue: String?): String {
        val realType = typeSpace.resolveTypeAliases(type)
        importType(realType)
        return "${fieldNameEscaped(name)}: ${realType.fullName()}${if (nullable) "?" else ""}" +
                defaultValue?.let { " = $it" }.orEmpty()
    }

    override fun fieldNameEscaped(name: String): String {
        val result = fieldName(name)
        return if (result in setOf("class", "object", "2faRequired")) "`$result`"
        else result
    }

    override fun fieldName(name: String): String {
        return under2camel(name)
    }

    override fun parentType(type: TypeId): String {
        val realType = typeSpace.resolveTypeAliases(type)
        importType(realType)
        return realType.fullName()
    }

    override fun importType(importedTypeId: TypeId) {
        val realType = typeSpace.resolveTypeAliases(importedTypeId)
        referencedTypes.add(realType)
        realType.genericParameters.forEach { importType(it) }
    }

    private fun isImplicitlyImported(typeId: TypeId): Boolean = when (typeId.packages.firstOrNull()) {
        "java" -> when (typeId.packages.elementAtOrNull(1)) {
            "lang" -> true
            null -> false
            else -> false
        }
        "kotlin" -> when (typeId.packages.elementAtOrNull(1)) {
            "annotation", "collections", "comparisons", "io", "ranges", "sequences", "text", "jvm", "js" -> true
            null -> true
            else -> false
        }
        null -> false
        else -> false
    }

    override fun importClause(currentTypeId: TypeId): String {
        val importsToDo = referencedTypes.filterNot {
            isImplicitlyImported(it) || it.packages == currentTypeId.packages
        }

        if (importsToDo.isEmpty()) return ""

        return importsToDo.map { "import ${it.qualifiedName()}" }.toSortedSet().joinToString("\n", prefix = "\n\n")
    }

    override fun copy(): SourceWriter {
        return KotlinSourceWriter(typeSpace)
    }

    override fun packageClause(typeId: TypeId): String {
        return "package " + typeId.packages.joinToString(".")
    }

    override fun enumItem(name: String, vararg values: String): String {
        val upperCasedName = name
            .toUpperCase()
            .split(Regex("[^\\w\\d]+"))
            .filter { it.isNotEmpty() }
            .joinToString("_")

        val namePrefix = if (upperCasedName.first().isDigit()) "N_" else ""

        return values.joinToString(", ", "$namePrefix$upperCasedName(", ")") { "\"$it\"" }
    }

    override fun realType(typeId: TypeId): TypeId {
        return typeSpace.resolveTypeAliases(typeId)
    }
}
