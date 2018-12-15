package name.alatushkin.vkapi.generator.source

import name.alatushkin.vkapi.generator.TypeSpace

class InterfaceMapping(private val typeSpace: TypeSpace) : TypeDefinition {
    override val fixedName: Boolean = true
    override val hasSource: Boolean = false

    fun typeId(basePackage: String): TypeId = TypeId(basePackage, "vkInterfaceMapping")

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        sourceWriter.importType(TypeId("com.fasterxml.jackson.databind.AbstractTypeResolver"))
        sourceWriter.importType(TypeId("com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver"))

        val mappings = typeSpace.interfaceImplementations
            .map { (iFace, Impl) ->
                typeSpace.resolveTypeAliases(iFace) to typeSpace.resolveTypeAliases(Impl)
            }
            .map { (iFace, Impl) ->
                sourceWriter.importType(iFace)
                sourceWriter.importType(Impl)
                "resolver.addMapping(${iFace.name}::class.java, ${Impl.name}::class.java)"
            }

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        return """
        |$packageClause$importClause
        |
        |fun ${typeId.name}(): AbstractTypeResolver {
        |    val resolver = SimpleAbstractTypeResolver()
        |
        |    ${mappings.joinToString("\n    ")}
        |
        |    return resolver
        |}
        """.trimMargin()
    }
}
