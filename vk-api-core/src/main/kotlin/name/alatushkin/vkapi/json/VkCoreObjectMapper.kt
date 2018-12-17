package name.alatushkin.vkapi.json

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.module.kotlin.KotlinModule

fun vkCoreObjectMapper(): ObjectMapper = ObjectMapper().apply {
    propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
    configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    val includeClassFields = JsonInclude.Include.NON_NULL
    val includeMapFields = JsonInclude.Include.NON_NULL
    setDefaultPropertyInclusion(JsonInclude.Value.construct(includeClassFields, includeMapFields))

    registerModule(KotlinModule())
    registerModule(VkCoreSerialModule())
}
