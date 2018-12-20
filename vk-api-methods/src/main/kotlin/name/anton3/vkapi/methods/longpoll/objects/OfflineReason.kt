package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator

enum class OfflineReason(val value: Int) {
    LEAVING(0),
    TIMEOUT(1);

    companion object {
        @JvmStatic
        @JsonCreator
        fun parse(value: Int): OfflineReason? {
            return OfflineReason.values().find { it.value == value }
        }
    }
}
