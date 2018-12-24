package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class StoryType(@get:JsonValue val value: String) {
    PHOTO("photo"),
    VIDEO("video")
}
