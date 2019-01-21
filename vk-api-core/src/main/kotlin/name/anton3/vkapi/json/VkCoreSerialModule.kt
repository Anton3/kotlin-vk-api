package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.json.deser.*
import name.anton3.vkapi.methods.execute.BatchExecuteResult
import name.anton3.vkapi.vktypes.*

class VkCoreSerialModule : SimpleModule() {
    init {
        addDeserializer(VkDate::class.java, VkDateDeserializer)
        addDeserializer(VkBirthDate::class.java, VkBirthDateDeserializer)
        addDeserializer(OkResponse::class.java, OkResponseDeserializer)
        addDeserializer(PropertyExists::class.java, PropertyExistsDeserializer)

        addDeserializer(VkResponse::class.java, VkResponseDeserializer())
        addDeserializer(BatchExecuteResult::class.java, BatchExecuteResultDeserializer)
    }
}
