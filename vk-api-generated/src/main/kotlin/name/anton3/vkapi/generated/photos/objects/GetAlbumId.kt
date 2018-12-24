package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetAlbumId(@get:JsonValue val value: String) {
    PROFILE("profile"),
    WALL("wall"),
    SAVED("saved")
}
