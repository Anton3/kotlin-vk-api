package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class NewsfeedItemType(@get:JsonValue val value: String) {
    POST("post"),
    PHOTO("photo"),
    PHOTO_TAG("photo_tag"),
    WALL_PHOTO("wall_photo"),
    FRIEND("friend"),
    NOTE("note"),
    AUDIO("audio"),
    VIDEO("video"),
    TOPIC("topic")
}
