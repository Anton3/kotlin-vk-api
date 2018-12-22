package name.anton3.vkapi.generator

import mu.KotlinLogging
import java.io.InputStream
import java.nio.file.Paths

private val log = KotlinLogging.logger {}

fun getResourceFiles(path: String): List<String> {
    return getResourceAsStream(path)?.use { it.reader().buffered().readLines() }.orEmpty()
}

private fun getResourceAsStream(resource: String): InputStream? {
    return Thread.currentThread().contextClassLoader.getResourceAsStream(resource)
        ?: resource::class.java.getResourceAsStream(resource)
}

fun main(vararg args: String) {
    log.warn("Root path: " + Paths.get(".").toAbsolutePath())

    val generator = SourceGenerator(basePackage = "name.anton3.vkapi.generated")

    generator.methodsSchemaFrom("methods.json")
    generator.loadObjectsDefinitionsFrom("objects.json")
    generator.loadResponsesDefinitionsFrom("responses.json")

    generator.loadPatchesFromPackage("/patch")

    generator.resolveTypes()

    generator.writeSourceTo(Paths.get("../vk-api-generated/src/main/kotlin"))
}
