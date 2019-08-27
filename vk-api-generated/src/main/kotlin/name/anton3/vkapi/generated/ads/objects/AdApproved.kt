package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class AdApproved(@JsonValue override val value: Int) : Value<Int> {
    NOT_MODERATED(0),
    PENDING_MODERATION(1),
    APPROVED(2),
    REJECTED(3);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): AdApproved = parseEnum(value)
    }
}
