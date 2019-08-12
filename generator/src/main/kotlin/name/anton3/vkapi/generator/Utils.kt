package name.anton3.vkapi.generator

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.google.common.base.CaseFormat

val mapper: ObjectMapper = objectMapper()
fun readTextFromFile(fileName: String): String = String::class.java.getResource(fileName).readText()
fun readSchemaTextFromFile(fileName: String): String = readTextFromFile("/schema/$fileName")
fun deserializeJson(json: String): JsonNode = mapper.readTree(json)!!
fun readJsonTreeFromSchema(fileName: String): JsonNode =
    deserializeJson(readSchemaTextFromFile(fileName))

fun objectMapper(): ObjectMapper = ObjectMapper().registerModule(KotlinModule())!!

fun camel2under(str: String): String = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str)
fun under2camel(str: String): String = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str)
fun under2Camel(str: String): String = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, str)
fun ucFirst(str: String): String = str.capitalize()
