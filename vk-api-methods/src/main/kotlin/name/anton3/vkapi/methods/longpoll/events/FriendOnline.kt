package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonCreator
import name.anton3.vkapi.methods.longpoll.objects.FriendPlatform
import name.anton3.vkapi.vktypes.VkDate

data class FriendOnline(
    override val eventType: Int,
    val userId: Int,
    val platform: FriendPlatform?,
    val timestamp: VkDate
) : LongPollEvent(eventType) {

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
        fun parse(
            eventType: Int,
            userId: Int,
            extra: Int,
            timestamp: VkDate,
            @Suppress("UNUSED_PARAMETER") unused1: Int?,
            @Suppress("UNUSED_PARAMETER") unused2: Int?
        ): FriendOnline {
            val platform = (extra and 0xFF).takeIf { it != 0 }?.let { platforms[it] }
            return FriendOnline(eventType, -userId, platform, timestamp)
        }

        private val platforms: Map<Int, FriendPlatform> = FriendPlatform.values().associateBy { it.value }
    }
}
