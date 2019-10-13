package name.anton3.vkapi.generator.definition

import name.anton3.vkapi.generator.source.SourceWriter
import name.anton3.vkapi.generator.source.TypeId

class TypeAliasDefinition(val originalType: TypeId) : Definition {
    override val fixedName: Boolean get() = false

    override val hasSource: Boolean get() = true

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {
        sourceWriter.importType(originalType)

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        return """
        |$packageClause$importClause
        |
        |typealias ${typeId.name} = ${originalType.name}
        """.trimMargin()
    }
}
