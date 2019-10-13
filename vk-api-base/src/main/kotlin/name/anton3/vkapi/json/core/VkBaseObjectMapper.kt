package name.anton3.vkapi.json.core

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import name.anton3.vkapi.json.deserializers.*
import name.anton3.vkapi.vktypes.*

val VkPropertyNamingStrategy: PropertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE

class VkBaseSerialModule : SimpleModule() {
    init {
        addDeserializer(VkDate::class.java, VkDateDeserializer)
        addDeserializer(VkBirthDate::class.java, VkBirthDateDeserializer)
        addDeserializer(OkResponse::class.java, OkResponseDeserializer)
        addDeserializer(PropertyExists::class.java, PropertyExistsDeserializer)

        addSerializer(VkBirthDateSerializer)
        addSerializer(OkResponseSerializer)
        addSerializer(PropertyExistsSerializer)

        addDeserializer(VkResponse::class.java, ContextualDeserializerBuilder(::VkResponseDeserializer))
        setMixInAnnotation(ValueEnum::class.java, ValueMixin::class.java)
    }
}

fun vkBaseObjectMapper(): ObjectMapper = ObjectMapper().apply {
    propertyNamingStrategy = VkPropertyNamingStrategy
    configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL)

    registerModule(KotlinModule())
    registerModule(VkBaseSerialModule())
}
