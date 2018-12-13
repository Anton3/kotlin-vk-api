package name.alatushkin.api.vk.generatorng.source.writer

import name.alatushkin.api.vk.generatorng.TypeSpace
import name.alatushkin.api.vk.generatorng.source.TypeId
import name.alatushkin.api.vk.under2camel

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

operator fun Boolean.invoke(onTrue: String, onFalse: String = ""): String = if (this) onTrue else onFalse

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
        return "    " + inherited("override ") + final("val ", "var ") + argument(
            name,
            type,
            nullable,
            defaultValue
        ) + (delegateBy?.let { " by $it" } ?: "")
    }

    override fun argument(name: String, type: TypeId, nullable: Boolean, defaultValue: String?): String {
        val realType = typeSpace.resolveTypeAliases(type)
        importType(realType)
        return "${fieldNameEscaped(name)}: ${realType.fullName()}${nullable("?")}" +
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
        val preResultName = name.toUpperCase().replace("[^\\w\\d]+".toRegex(), "_")
        val finalName = if ("0123456789".contains(preResultName[0])) {
            val parts = preResultName.split("_")
            if (parts.size == 2)
                parts[1] + "_" + parts[0]
            else
                "_$preResultName"
        } else
            preResultName

        return finalName + "(" + values.joinToString(", ") { "\"$it\"" } + ")"
    }

    override fun realType(typeId: TypeId): TypeId {
        return typeSpace.resolveTypeAliases(typeId)
    }
}
