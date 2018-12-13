package name.alatushkin.api.vk.generatorng.source

import name.alatushkin.api.vk.generatorng.TypeSpace
import name.alatushkin.api.vk.generatorng.source.writer.SourceWriter

class InterfaceMapping(private val typeSpace: TypeSpace) : TypeDefinition {
    override val fixedName: Boolean = true
    override val hasSource: Boolean = true

    fun typeId(basePackage: String): TypeId = TypeId(basePackage, "vkInterfaceMapping")

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String {

        sourceWriter.importType(TypeId("kotlin.reflect.KClass"))

        val mappings = typeSpace.interfaceImplementations
            .map { (iFace, Impl) ->
                typeSpace.resolveTypeAliases(iFace) to typeSpace.resolveTypeAliases(Impl)
            }
            .map { (iFace, Impl) ->
                sourceWriter.importType(iFace)
                sourceWriter.importType(Impl)
                "${iFace.name}::class to ${Impl.name}::class"
            }

        val packageClause = sourceWriter.packageClause(typeId)
        val importClause = sourceWriter.importClause(typeId)

        return """
        |$packageClause$importClause
        |
        |internal fun ${typeId.name}(): Map<KClass<out Any>, KClass<out Any>> = mapOf(
        |    ${mappings.joinToString(",\n    ")}
        |)
        """.trimMargin()
    }
}
