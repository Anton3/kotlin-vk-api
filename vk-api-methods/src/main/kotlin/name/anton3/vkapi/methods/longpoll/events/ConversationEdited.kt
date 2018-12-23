package name.anton3.vkapi.methods.longpoll.events

import name.anton3.vkapi.methods.longpoll.objects.ConversationEditType

data class ConversationEdited(
    override val eventType: Int,
    val typeId: ConversationEditType,
    val peerId: Int,
    val info: Int
) : LongPollEvent(eventType)
