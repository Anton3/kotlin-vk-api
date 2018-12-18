package name.anton3.vkapi.generator.source

import java.nio.file.FileSystems
import java.util.*

data class TypeId (
    val packages: List<String>,
    val name: String,
    val genericParameters: List<TypeId> = emptyList()
) {
    constructor(
        packages: String,
        name: String,
        genericParameters: List<TypeId> = emptyList(),
        basePackage: String = ""
    ) : this(
        basePackage.splitOrEmpty(".") + packages.split('.'),
        name,
        genericParameters
    )

    constructor(
        qualifiedName: String,
        genericParameters: List<TypeId> = emptyList(),
        basePackage: String = ""
    ) : this(
        basePackage.splitOrEmpty(".") + qualifiedName.split('.').dropLast(1),
        qualifiedName.substringAfterLast('.'),
        genericParameters
    )

    init {
        val letters = Regex("""\w+""")
        require(name.matches(letters)) { "Bad type name: $name" }
        require(packages.all { it.matches(letters) }) { "Bad packages: $packages" }
    }

    fun fullName(): String {
        return name + genericParameters.isNotEmpty()(
            onTrue = "<${genericParameters.joinToString(", ") { it.fullName() }}>"
        )
    }

    private fun fullPackage(): String = packages.joinToString(".")

    fun qualifiedName(): String = "${fullPackage()}.$name"

    private fun fileName(): String = "$name.kt".capitalize()

    fun filePath(): String = joinToPath(packages + listOf(fileName()))

    override fun toString(): String {
        return "${fullPackage()}.$name" + genericParameters.isNotEmpty()(
            onTrue = "<${genericParameters.joinToString(", ")}>"
        )
    }
}

fun TypeId.allNestedGenericParameters(): List<TypeId> {
    return treeNodesToList(this, estimatedCount = 4) { it.genericParameters }.distinctBy { it.qualifiedName() }
}

fun TypeId.allWildcardGenerics(): List<TypeId> {
    return allNestedGenericParameters().map { it.copy(genericParameters = emptyList()) }.distinct()
}

inline fun <T> treeNodesToList(root: T, estimatedCount: Int = 16, children: (T) -> List<T>): List<T> {
    val result = mutableListOf<T>()
    val nodesToVisit = ArrayDeque<T>(estimatedCount)
    nodesToVisit.addLast(root)

    while (nodesToVisit.isNotEmpty()) {
        val node = nodesToVisit.removeFirst()!!
        result.add(node)
        children(node).forEach { nodesToVisit.addLast(it) }
    }

    return result
}

typealias JsonTypeRef = String

fun joinToPath(components: List<String>): String {
    return components.joinToString(FileSystems.getDefault().separator)
}

fun String.splitOrEmpty(vararg delimiters: String): List<String> {
    return takeIf { it.isNotEmpty() }?.split(*delimiters).orEmpty()
}

interface TypeDefinition {
    val fixedName: Boolean
    val hasSource: Boolean

    fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {
        return sourceWriter.packageClause(typeId)
    }
}

object BuiltinType : TypeDefinition {
    override val fixedName: Boolean get() = true
    override val hasSource: Boolean get() = false
}
