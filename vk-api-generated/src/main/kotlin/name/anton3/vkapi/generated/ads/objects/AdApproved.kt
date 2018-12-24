package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class AdApproved(@get:JsonValue val value: String) {
    NOT_MODERATED("0"),
    PENDING_MODERATION("1"),
    APPROVED("2"),
    REJECTED("3")
}
