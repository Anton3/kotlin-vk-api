package name.anton3.vkapi.json.core

import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.json.deserializers.*
import name.anton3.vkapi.vktypes.*

class VkBaseSerialModule : SimpleModule() {
    init {
        addDeserializer(VkDate::class.java, VkDateDeserializer)
        addDeserializer(VkBirthDate::class.java, VkBirthDateDeserializer)
        addDeserializer(OkResponse::class.java, OkResponseDeserializer)
        addDeserializer(PropertyExists::class.java, PropertyExistsDeserializer)

        addSerializer(VkBirthDateSerializer)
        addSerializer(OkResponseSerializer)
        addSerializer(PropertyExistsSerializer)

        addDeserializer(VkResponse::class.java, VkResponseDeserializer.builder())
    }
}
