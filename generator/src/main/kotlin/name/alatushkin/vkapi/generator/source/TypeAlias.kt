package name.alatushkin.vkapi.generator.source

import name.alatushkin.vkapi.generator.source.writer.SourceWriter

class TypeAlias(val originalType: TypeId) : TypeDefinition {
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
