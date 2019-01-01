package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment
import name.anton3.vkapi.json.deser.LongPollEventDeserializer
import name.anton3.vkapi.json.deser.VkCommentAttachmentsDeserializer
import name.anton3.vkapi.json.deser.VkMessageAttachmentsDeserializer
import name.anton3.vkapi.json.deser.VkWallPostAttachmentsDeserializer
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent

class VkMainSerialModule : SimpleModule() {
    init {
        addDeserializer(WallpostAttachment::class.java, VkWallPostAttachmentsDeserializer)
        addDeserializer(CommentAttachment::class.java, VkCommentAttachmentsDeserializer)
        addDeserializer(MessageAttachment::class.java, VkMessageAttachmentsDeserializer)

        addDeserializer(LongPollEvent::class.java, LongPollEventDeserializer)
    }
}

fun vkObjectMapper(): ObjectMapper {
    return vkCoreObjectMapper().registerModule(VkMainSerialModule())
}
