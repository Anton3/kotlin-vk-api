package name.anton3.vkapi.json.core

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.json.deserializers.BatchExecuteResultDeserializer
import name.anton3.vkapi.methods.execute.BatchExecuteResult

class VkCoreSerialModule : SimpleModule() {
    init {
        addDeserializer(BatchExecuteResult::class.java, BatchExecuteResultDeserializer)
    }
}

fun vkCoreObjectMapper(): ObjectMapper {
    return vkBaseObjectMapper().registerModule(VkCoreSerialModule())
}
