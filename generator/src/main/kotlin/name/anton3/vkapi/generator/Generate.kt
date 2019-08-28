package name.anton3.vkapi.generator

import org.apache.logging.log4j.kotlin.logger
import java.nio.file.Paths

private val logger = logger("Generate")

fun main() {
    logger.warn("Root path: " + Paths.get(".").toAbsolutePath())

    val generator = SourceGenerator(basePackage = "name.anton3.vkapi.generated")

    generator.methodsSchemaFrom("methods.json")
    generator.loadObjectsDefinitionsFrom("objects.json")
    generator.loadResponsesDefinitionsFrom("responses.json")

    generator.loadPatchesFromPackage("/patch")

    generator.resolveTypes()

    generator.writeSourceTo(Paths.get("./vk-api-generated/src/main/kotlin"))
}
