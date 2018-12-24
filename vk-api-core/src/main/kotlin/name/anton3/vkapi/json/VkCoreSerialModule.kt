package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.json.deser.*
import name.anton3.vkapi.methods.execute.BatchExecuteResult
import name.anton3.vkapi.vktypes.VkBirthDate
import name.anton3.vkapi.vktypes.VkDate
import name.anton3.vkapi.vktypes.VkResponse

class VkCoreSerialModule : SimpleModule() {
    init {
        addDeserializer(VkDate::class.java, UnixTimeDeserializer)
        addDeserializer(VkBirthDate::class.java, VkBirthDateDeserializer)
        addDeserializer(Unit::class.java, UnitDeserializer)

        addDeserializer(VkResponse::class.java, VkResponseDeserializer())
        addDeserializer(BatchExecuteResult::class.java, BatchExecuteResultDeserializer)
    }
}
