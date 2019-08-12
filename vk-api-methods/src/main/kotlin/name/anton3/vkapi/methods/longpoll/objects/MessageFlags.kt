package name.anton3.vkapi.methods.longpoll.objects

object MessageFlags {
    const val UNREAD: Int = 1
    const val OUTBOX: Int = 2
    const val REPLIED: Int = 4
    const val IMPORTANT: Int = 8
    const val FROM_FRIEND: Int = 32
    const val SPAM: Int = 64
    const val DELETED: Int = 128
    const val HIDDEN: Int = 65536
    const val DELETED_FOR_ALL: Int = 131072
}
