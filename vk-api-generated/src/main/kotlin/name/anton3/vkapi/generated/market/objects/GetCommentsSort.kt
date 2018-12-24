package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetCommentsSort(@get:JsonValue val value: String) {
    OLD_TO_NEW("asc"),
    NEW_TO_OLD("desc")
}
