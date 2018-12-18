package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.json.deser.BatchExecuteResultDeserializer
import name.anton3.vkapi.json.deser.UnixTimeDeserializer
import name.anton3.vkapi.json.deser.VkBirthDateDeserializer
import name.anton3.vkapi.json.deser.VkResponseDeserializer
import name.anton3.vkapi.methods.execute.BatchExecuteResult
import name.anton3.vkapi.vktypes.VkBirthDate
import name.anton3.vkapi.vktypes.VkDate
import name.anton3.vkapi.vktypes.VkResponse

class VkCoreSerialModule : SimpleModule() {
    init {
        addDeserializer(VkDate::class.java, UnixTimeDeserializer)
        addDeserializer(VkBirthDate::class.java, VkBirthDateDeserializer)
        addDeserializer(VkResponse::class.java, VkResponseDeserializer())

        addDeserializer(BatchExecuteResult::class.java, BatchExecuteResultDeserializer)
    }
}
