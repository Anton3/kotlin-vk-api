package name.alatushkin.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonCreator
import name.alatushkin.vkapi.methods.longpoll.objects.OfflineReason
import name.alatushkin.vkapi.vktypes.VkDate

data class FriendOffline(
    override val eventType: Int,
    val userId: Long,
    val reason: OfflineReason,
    val timestamp: VkDate
) : LongPollEvent(eventType) {

    companion object {
        @JvmStatic
        @JsonCreator
        fun parse(eventType: Int, userId: Long, reason: OfflineReason, timestamp: VkDate): FriendOffline {
            return FriendOffline(eventType, -userId, reason, timestamp)
        }
    }
}
