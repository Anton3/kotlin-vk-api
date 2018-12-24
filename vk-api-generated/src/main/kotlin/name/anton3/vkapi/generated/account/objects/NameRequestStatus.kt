package name.anton3.vkapi.generated.account.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class NameRequestStatus(@get:JsonValue val value: String) {
    SUCCESS("success"),
    PROCESSING("processing"),
    DECLINED("declined"),
    WAS_ACCEPTED("was_accepted"),
    WAS_DECLINED("was_declined")
}
