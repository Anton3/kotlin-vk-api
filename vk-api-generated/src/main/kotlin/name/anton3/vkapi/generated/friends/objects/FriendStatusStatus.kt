package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class FriendStatusStatus(@get:JsonValue val value: String) {
    NOT_A_FRIEND("0"),
    OUTCOMING_REQUEST("1"),
    INCOMING_REQUEST("2"),
    IS_FRIEND("3")
}
