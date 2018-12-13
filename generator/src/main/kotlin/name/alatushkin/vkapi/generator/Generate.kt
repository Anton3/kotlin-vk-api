package name.alatushkin.vkapi.generator

import java.io.InputStream
import java.nio.file.Paths

fun getResourceFiles(path: String): List<String> = getResourceAsStream(path).use{
    return it?.reader()?.buffered()?.readLines().orEmpty()
}

private fun getResourceAsStream(resource: String): InputStream? =
        Thread.currentThread().contextClassLoader.getResourceAsStream(resource)
                ?: resource::class.java.getResourceAsStream(resource)

fun main(vararg args: String) {
    val generator = SourceGenerator(basePackage = "name.alatushkin.vkapi.generated")

    generator.methodsSchemaFrom("methods.json")
    generator.loadObjectsDefinitionsFrom("objects.json")
    generator.loadResponsesDefinitionsFrom("responces.json")

    generator.loadPatchesFromPackage("/patch")

    generator.resolveTypes()

    generator.writeSourceTo(Paths.get("vk-api/src/main/kotlin"))
}
