package name.anton3.vkapi.generator

import com.google.common.base.CaseFormat

fun readTextFromFile(fileName: String): String = String::class.java.getResource(fileName).readText()
fun readSchemaTextFromFile(fileName: String): String = readTextFromFile("/schema/$fileName")

fun camel2under(str: String): String = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str)
fun under2camel(str: String): String = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str)
fun under2Camel(str: String): String = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, str)
