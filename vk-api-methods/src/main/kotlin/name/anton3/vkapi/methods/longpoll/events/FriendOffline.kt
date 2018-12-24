package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonCreator
import name.anton3.vkapi.methods.longpoll.objects.OfflineReason
import name.anton3.vkapi.vktypes.VkDate

data class FriendOffline(
    override val eventType: Int,
    val userId: Long,
    val reason: OfflineReason,
    val timestamp: VkDate
) : LongPollEvent(eventType) {

    companion object {
        @JvmStatic
        @JsonCreator(mode=JsonCreator.Mode.DELEGATING)
        fun parse(eventType: Int, userId: Long, reason: OfflineReason, timestamp: VkDate): FriendOffline {
            return FriendOffline(eventType, -userId, reason, timestamp)
        }
    }
}
