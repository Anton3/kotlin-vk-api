package name.alatushkin.vkapi.json

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.vkInterfaceMapping
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
import name.alatushkin.vkapi.json.deser.*
import name.alatushkin.vkapi.methods.execute.BatchExecuteResult
import name.alatushkin.vkapi.vktypes.VkResponse
import name.alatushkin.vkapi.json.deser.*

internal val VK_OBJECT_MAPPER: ObjectMapper = vkObjectMapper()

private fun vkObjectMapper(): ObjectMapper {
    val mapper = jacksonObjectMapper()

    mapper.propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    val module = SimpleModule()
    module.addDeserializer(WallpostAttachment::class.java,
        VkWallPostAttachmentsDeserializer()
    )
    module.addDeserializer(CommentAttachment::class.java,
        VkCommentAttachmentsDeserializer()
    )
    module.addDeserializer(MessageAttachment::class.java,
        VkMessageAttachmentsDeserializer()
    )
    module.addDeserializer(VkResponse::class.java, VkResponseDeserializer())
    module.addDeserializer(
        BatchExecuteResult::class.java,
        BatchExecuteResultDeserializer()
    )

    val resolver = SimpleAbstractTypeResolver()
    for ((from, to) in vkInterfaceMapping()) {
        @Suppress("UNCHECKED_CAST")
        resolver.addMapping(from.java as Class<Any>, to.java as Class<Any>)
    }
    module.setAbstractTypes(resolver)

    mapper.registerModule(module)
    return mapper
}
