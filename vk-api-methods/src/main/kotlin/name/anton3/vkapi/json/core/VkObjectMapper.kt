package name.anton3.vkapi.json.core

import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import name.anton3.vkapi.generated.docs.objects.SaveDoc
import name.anton3.vkapi.generated.docs.objects.SaveDocBody
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment
import name.anton3.vkapi.json.deserializers.*
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import name.anton3.vkapi.methods.longpoll.events.MessageAdded
import name.anton3.vkapi.methods.longpoll.events.MessageEdited

internal fun <T> SimpleModule.addDeserializer(deserializer: JsonDeserializer<T>): SimpleModule {
    @Suppress("UNCHECKED_CAST")
    val type = deserializer.handledType() as Class<T>?

    addDeserializer(type!!, deserializer)
    return this
}

class VkMainSerialModule : SimpleModule() {
    init {
        addSerializer(vkPolymorphicSerializer<WallpostAttachment, WallPostAttachmentBody>())
        addSerializer(vkPolymorphicSerializer<CommentAttachment, CommentAttachmentBody>())
        addSerializer(vkPolymorphicSerializer<MessageAttachment, MessageAttachmentBody>())
        addSerializer(vkPolymorphicSerializer<SaveDoc, SaveDocBody>())
        addDeserializer(vkPolymorphicDeserializer<WallpostAttachment, WallPostAttachmentBody>(wallPostAttachmentTypes))
        addDeserializer(vkPolymorphicDeserializer<CommentAttachment, CommentAttachmentBody>(commentAttachmentTypes))
        addDeserializer(vkPolymorphicDeserializer<MessageAttachment, MessageAttachmentBody>(messageAttachmentTypes))
        addDeserializer(vkPolymorphicDeserializer<SaveDoc, SaveDocBody>(saveDocResponseTypes))

        addDeserializer(LongPollEvent::class.java, LongPollEventDeserializer)
        setMixInAnnotation(MessageAdded::class.java, LongPollAttachmentsMixin::class.java)
        setMixInAnnotation(MessageEdited::class.java, LongPollAttachmentsMixin::class.java)
    }
}

fun vkObjectMapper(): ObjectMapper {
    return vkCoreObjectMapper().registerModule(VkMainSerialModule())
}
