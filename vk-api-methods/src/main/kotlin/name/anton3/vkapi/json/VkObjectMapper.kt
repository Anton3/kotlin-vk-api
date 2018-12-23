package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment
import name.anton3.vkapi.json.deser.*
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import name.anton3.vkapi.methods.longpoll.objects.ExtraFields
import name.anton3.vkapi.methods.longpoll.objects.Flags

class VkMainSerialModule : SimpleModule() {
    init {
        addDeserializer(WallpostAttachment::class.java, VkWallPostAttachmentsDeserializer)
        addDeserializer(CommentAttachment::class.java, VkCommentAttachmentsDeserializer)
        addDeserializer(MessageAttachment::class.java, VkMessageAttachmentsDeserializer)

        addDeserializer(ExtraFields::class.java, ExtraFieldsDeserializer)
        addDeserializer(LongPollEvent::class.java, LongPollEventDeserializer)
        addDeserializer(Flags::class.java, FlagsDeserializer)
    }
}

fun vkObjectMapper(): ObjectMapper {
    return vkCoreObjectMapper().registerModule(VkMainSerialModule())
}
