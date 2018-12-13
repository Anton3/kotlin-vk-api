package name.alatushkin.api.vk.json

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import name.alatushkin.api.vk.execute.BatchExecuteResult
import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.generated.vkInterfaceMapping
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment
import name.alatushkin.api.vk.json.deser.*
import name.alatushkin.api.vk.vktypes.VkResponse

internal val VK_OBJECT_MAPPER: ObjectMapper = vkObjectMapper()

private fun vkObjectMapper(): ObjectMapper {
    val mapper = jacksonObjectMapper()

    mapper.propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    val module = SimpleModule()
    module.addDeserializer(WallpostAttachment::class.java, VkWallPostAttachmentsDeserializer())
    module.addDeserializer(CommentAttachment::class.java, VkCommentAttachmentsDeserializer())
    module.addDeserializer(MessageAttachment::class.java, VkMessageAttachmentsDeserializer())
    module.addDeserializer(VkResponse::class.java, VkResponseDeserializer())
    module.addDeserializer(BatchExecuteResult::class.java, BatchExecuteResultDeserializer())

    val resolver = SimpleAbstractTypeResolver()
    for ((from, to) in vkInterfaceMapping()) {
        @Suppress("UNCHECKED_CAST")
        resolver.addMapping(from.java as Class<Any>, to.java as Class<Any>)
    }
    module.setAbstractTypes(resolver)

    mapper.registerModule(module)
    return mapper
}
