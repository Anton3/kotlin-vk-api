package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class UnsubscribeType(@get:JsonValue val value: String) {
    NOTE("note"),
    PHOTO("photo"),
    POST("post"),
    TOPIC("topic"),
    VIDEO("video")
}
