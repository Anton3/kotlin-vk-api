package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ItemWallpostType(@get:JsonValue val value: String) {
    POST("post"),
    COPY("copy"),
    REPLY("reply")
}
