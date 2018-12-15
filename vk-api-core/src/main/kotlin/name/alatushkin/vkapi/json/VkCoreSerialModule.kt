package name.alatushkin.vkapi.json

import com.fasterxml.jackson.databind.module.SimpleModule
import name.alatushkin.vkapi.json.deser.BatchExecuteResultDeserializer
import name.alatushkin.vkapi.json.deser.UnixTimeDeserializer
import name.alatushkin.vkapi.json.deser.VkBirthDateDeserializer
import name.alatushkin.vkapi.json.deser.VkResponseDeserializer
import name.alatushkin.vkapi.methods.execute.BatchExecuteResult
import name.alatushkin.vkapi.vktypes.VkBirthDate
import name.alatushkin.vkapi.vktypes.VkDate
import name.alatushkin.vkapi.vktypes.VkResponse

class VkCoreSerialModule : SimpleModule() {
    init {
        addDeserializer(VkDate::class.java, UnixTimeDeserializer)
        addDeserializer(VkBirthDate::class.java, VkBirthDateDeserializer)
        addDeserializer(VkResponse::class.java, VkResponseDeserializer())

        addDeserializer(BatchExecuteResult::class.java, BatchExecuteResultDeserializer)
    }
}
