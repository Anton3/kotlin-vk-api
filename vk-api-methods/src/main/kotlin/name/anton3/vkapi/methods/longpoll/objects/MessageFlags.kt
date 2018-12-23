package name.anton3.vkapi.methods.longpoll.objects

object MessageFlags {
    val UNREAD = 1L
    val OUTBOX = 2L
    val REPLIED = 4L
    val IMPORTANT = 8L
    val FROM_FRIEND = 32L
    val SPAM = 64L
    val DELETED = 128L
    val HIDDEN = 65536L
    val DELETED_FOR_ALL = 131072L
}
