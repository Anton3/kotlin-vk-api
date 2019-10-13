package name.anton3.vkapi.generator.definition

import name.anton3.vkapi.generator.source.SourceWriter
import name.anton3.vkapi.generator.source.TypeId

interface Definition {
    val fixedName: Boolean
    val hasSource: Boolean

    fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String
}

object BuiltinDefinition : Definition {
    override val fixedName: Boolean get() = true
    override val hasSource: Boolean get() = false

    override fun generateSource(basePackage: String, typeId: TypeId, sourceWriter: SourceWriter): String =
        throw NotImplementedError()
}
