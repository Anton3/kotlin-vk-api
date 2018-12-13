package name.alatushkin.vkapi.generator.json

import com.fasterxml.jackson.databind.JsonNode

fun JsonNode.names(): List<String> = this.fieldNames().asSequence().toList()
