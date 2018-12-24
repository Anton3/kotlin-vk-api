package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupFullMemberStatus(@get:JsonValue val value: String) {
    NOT_A_MEMBER("0"),
    MEMBER("1"),
    NOT_SURE("2"),
    DECLINED("3"),
    HAS_SENT_A_REQUEST("4"),
    INVITED("5")
}
