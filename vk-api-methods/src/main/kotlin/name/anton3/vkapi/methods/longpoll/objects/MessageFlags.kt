package name.anton3.vkapi.methods.longpoll.objects

object MessageFlags {
    const val UNREAD = 1
    const val OUTBOX = 2
    const val REPLIED = 4
    const val IMPORTANT = 8
    const val FROM_FRIEND = 32
    const val SPAM = 64
    const val DELETED = 128
    const val HIDDEN = 65536
    const val DELETED_FOR_ALL = 131072
}
