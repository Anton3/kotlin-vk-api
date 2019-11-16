package name.anton3.vkapi.methods.longpoll.events

import name.anton3.vkapi.generated.account.objects.PushConversationsItem

data class NotificationSettingsSet(
    override val eventType: Int,
    val extra: PushConversationsItem
) : LongPollEvent(eventType)
