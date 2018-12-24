package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class PostType(@get:JsonValue val value: String) {
    POST("post"),
    COPY("copy"),
    REPLY("reply"),
    POSTPONE("postpone"),
    SUGGEST("suggest")
}
