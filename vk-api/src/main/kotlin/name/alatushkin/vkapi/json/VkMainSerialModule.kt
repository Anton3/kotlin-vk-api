package name.alatushkin.vkapi.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
import name.alatushkin.vkapi.json.deser.ExtraFieldsDeserializer
import name.alatushkin.vkapi.json.deser.VkCommentAttachmentsDeserializer
import name.alatushkin.vkapi.json.deser.VkMessageAttachmentsDeserializer
import name.alatushkin.vkapi.json.deser.VkWallPostAttachmentsDeserializer
import name.alatushkin.vkapi.methods.longpoll.objects.ExtraFields

class VkMainSerialModule : SimpleModule() {
    init {
        addDeserializer(WallpostAttachment::class.java, VkWallPostAttachmentsDeserializer)
        addDeserializer(CommentAttachment::class.java, VkCommentAttachmentsDeserializer)
        addDeserializer(MessageAttachment::class.java, VkMessageAttachmentsDeserializer)

        addDeserializer(ExtraFields::class.java, ExtraFieldsDeserializer)
    }
}

fun vkObjectMapper(): ObjectMapper {
    return vkCoreObjectMapper().registerModule(VkMainSerialModule())
}
