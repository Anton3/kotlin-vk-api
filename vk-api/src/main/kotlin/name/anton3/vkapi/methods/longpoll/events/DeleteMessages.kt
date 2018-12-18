package name.anton3.vkapi.methods.longpoll.events

data class DeleteMessages(override val eventType: Int) : LongPollEvent(eventType)
