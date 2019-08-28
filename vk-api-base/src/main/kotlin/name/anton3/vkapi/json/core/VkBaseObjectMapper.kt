package name.anton3.vkapi.json.core

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import name.anton3.vkapi.json.deserializers.*
import name.anton3.vkapi.vktypes.*

object VkPropertyNamingStrategy : PropertyNamingStrategy.PropertyNamingStrategyBase() {
    override fun translate(propertyName: String): String {
        val builder = StringBuilder(propertyName.length * 2)
        var previous: Char? = null

        for (character in propertyName) {
            when {
                character.isDigit() -> {
                    if (previous?.isDigit() == false && noUnderscore.none { it in propertyName }) builder.append('_')
                    builder.append(character)
                }
                character.isLowerCase() -> {
                    builder.append(character)
                }
                character.isUpperCase() -> {
                    builder.append('_')
                    builder.append(character.toLowerCase())
                }
                else -> error("Unknown character in property name: $character")
            }
            previous = character
        }

        return builder.toString()
    }

    private val noUnderscore: List<String> = listOf("Mp3", "X2", "x2", "Y2", "y2", "category1", "v1", "v2")
}

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
        setMixInAnnotation(Value::class.java, ValueMixin::class.java)
    }
}

fun vkBaseObjectMapper(): ObjectMapper = ObjectMapper().apply {
    propertyNamingStrategy = VkPropertyNamingStrategy
    configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL)

    registerModule(KotlinModule())
    registerModule(VkBaseSerialModule())
}
