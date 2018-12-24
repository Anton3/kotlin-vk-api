package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class OfflineReason(@get:JsonValue val value: Int) {
    LEAVING(0),
    TIMEOUT(1);
}
