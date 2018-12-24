package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class UnignoreItemType(@get:JsonValue val value: String) {
    WALL("wall"),
    TAG("tag"),
    PROFILEPHOTO("profilephoto"),
    VIDEO("video"),
    AUDIO("audio")
}
