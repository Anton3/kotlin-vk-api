package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class IgnoreItemType(@get:JsonValue val value: String) {
    POST_ON_THE_WALL("wall"),
    TAG_ON_A_PHOTO("tag"),
    PROFILE_PHOTO("profilephoto"),
    VIDEO("video"),
    AUDIO("audio")
}
