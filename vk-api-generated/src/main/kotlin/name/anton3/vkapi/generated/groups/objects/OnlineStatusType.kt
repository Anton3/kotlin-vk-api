package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class OnlineStatusType(@get:JsonValue val value: String) {
    NONE("none"),
    ONLINE("online"),
    ANSWER_MARK("answer_mark")
}
