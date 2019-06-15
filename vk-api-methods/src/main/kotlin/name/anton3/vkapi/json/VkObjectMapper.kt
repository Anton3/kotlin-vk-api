package name.anton3.vkapi.json

import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment
import name.anton3.vkapi.json.deser.*
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent

fun <T> SimpleModule.addDeserializer(deserializer: JsonDeserializer<T>): SimpleModule {
    @Suppress("UNCHECKED_CAST")
    val type = deserializer.handledType() as Class<T>

    addDeserializer(type, deserializer)
    return this
}

class VkMainSerialModule : SimpleModule() {
    init {
        registerSubtypes(*wallPostAttachmentTypes.toTypedArray())
        registerSubtypes(*commentAttachmentTypes.toTypedArray())
        registerSubtypes(*messageAttachmentTypes.toTypedArray())

        setMixInAnnotation(WallPostAttachmentBody::class.java, AttachmentBodyMixin::class.java)
        setMixInAnnotation(CommentAttachmentBody::class.java, AttachmentBodyMixin::class.java)
        setMixInAnnotation(MessageAttachmentBody::class.java, AttachmentBodyMixin::class.java)

        addSerializer(attachmentSerializer<WallpostAttachment, WallPostAttachmentBody>())
        addSerializer(attachmentSerializer<CommentAttachment, CommentAttachmentBody>())
        addSerializer(attachmentSerializer<MessageAttachment, MessageAttachmentBody>())
        addDeserializer(attachmentDeserializer<WallpostAttachment, WallPostAttachmentBody>())
        addDeserializer(attachmentDeserializer<CommentAttachment, CommentAttachmentBody>())
        addDeserializer(attachmentDeserializer<MessageAttachment, MessageAttachmentBody>())

        addDeserializer(LongPollEvent::class.java, LongPollEventDeserializer)
    }
}

fun vkObjectMapper(): ObjectMapper {
    return vkCoreObjectMapper().registerModule(VkMainSerialModule())
}
