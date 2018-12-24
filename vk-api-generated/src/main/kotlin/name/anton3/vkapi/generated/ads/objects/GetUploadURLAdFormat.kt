package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetUploadURLAdFormat(@get:JsonValue val value: String) {
    IMAGE_AND_TEXT("1"),
    BIG_IMAGE("2"),
    EXCLUSIVE_FORMAT("3"),
    COMMUNITY_SQUARE_IMAGE("4"),
    SPECIAL_APP_FORMAT("7")
}
