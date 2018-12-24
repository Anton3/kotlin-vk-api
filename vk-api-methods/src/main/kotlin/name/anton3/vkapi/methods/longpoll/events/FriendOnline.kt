package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonCreator
import name.anton3.vkapi.methods.longpoll.objects.FriendPlatform
import name.anton3.vkapi.vktypes.VkDate

data class FriendOnline(
    override val eventType: Int,
    val userId: Long,
    val platform: FriendPlatform?,
    val timestamp: VkDate
) : LongPollEvent(eventType) {

    companion object {
        @JvmStatic
        @JsonCreator
        fun parse(eventType: Int, userId: Long, extra: Long, timestamp: VkDate): FriendOnline {
            return FriendOnline(
                eventType,
                -userId,
                FriendPlatform.values().first { it.value == extra and 0xFF },
                timestamp
            )
        }
    }
}
