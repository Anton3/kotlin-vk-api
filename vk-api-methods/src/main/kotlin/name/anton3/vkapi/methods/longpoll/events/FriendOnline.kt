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
        fun parse(eventType: Int, userId: Int, extra: Int, timestamp: VkDate): FriendOnline {
            return FriendOnline(
                eventType,
                -userId,
                (extra and 0xFF).takeIf { it != 0 }?.let { FriendPlatform.parse(it) },
                timestamp
            )
        }
    }
}
