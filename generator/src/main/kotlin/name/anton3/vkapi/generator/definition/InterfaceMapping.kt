package name.anton3.vkapi.generator.definition

import com.fasterxml.jackson.databind.AbstractTypeResolver
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver
import name.anton3.vkapi.generator.TypeSpace
import name.anton3.vkapi.generator.source.SourceWriter
import name.anton3.vkapi.generator.source.TypeId

class InterfaceMapping(private val typeSpace: TypeSpace) : Definition {
    override val fixedName: Boolean = true
    override val hasSource: Boolean = false

    fun typeId(basePackage: String): TypeId =
        TypeId(basePackage, "vkInterfaceMapping")

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        sourceWriter.importType(TypeId<AbstractTypeResolver>())
        sourceWriter.importType(TypeId<SimpleAbstractTypeResolver>())

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
