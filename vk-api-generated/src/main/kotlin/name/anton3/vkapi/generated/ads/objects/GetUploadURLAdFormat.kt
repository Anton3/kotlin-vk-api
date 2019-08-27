package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetUploadURLAdFormat(@JsonValue override val value: Int) : Value<Int> {
    IMAGE_AND_TEXT(1),
    BIG_IMAGE(2),
    EXCLUSIVE_FORMAT(3),
    COMMUNITY_SQUARE_IMAGE(4),
    SPECIAL_APP_FORMAT(7);

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: Int): GetUploadURLAdFormat = parseEnum(value)
    }
}
