package name.anton3.vkapi.generated.utils.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class LinkCheckedStatus(@get:JsonValue val value: String) {
    NOT_BANNED("not_banned"),
    BANNED("banned"),
    PROCESSING("processing")
}
