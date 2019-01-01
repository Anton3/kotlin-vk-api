package name.anton3.vkapi.methods.longpoll.objects

object MessageFlags {
    val UNREAD = 1
    val OUTBOX = 2
    val REPLIED = 4
    val IMPORTANT = 8
    val FROM_FRIEND = 32
    val SPAM = 64
    val DELETED = 128
    val HIDDEN = 65536
    val DELETED_FOR_ALL = 131072
}
