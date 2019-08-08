package name.anton3.vkapi.json.core

import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.json.deserializers.OkResponseDeserializer
import name.anton3.vkapi.json.deserializers.PropertyExistsDeserializer
import name.anton3.vkapi.json.deserializers.VkBirthDateDeserializer
import name.anton3.vkapi.json.deserializers.VkDateDeserializer
import name.anton3.vkapi.json.deserializers.VkResponseDeserializer
import name.anton3.vkapi.vktypes.*

class VkBaseSerialModule : SimpleModule() {
    init {
        addDeserializer(VkDate::class.java, VkDateDeserializer)
        addDeserializer(VkBirthDate::class.java, VkBirthDateDeserializer)
        addDeserializer(OkResponse::class.java, OkResponseDeserializer)
        addDeserializer(PropertyExists::class.java, PropertyExistsDeserializer)

        addDeserializer(VkResponse::class.java, VkResponseDeserializer.builder())
    }
}
