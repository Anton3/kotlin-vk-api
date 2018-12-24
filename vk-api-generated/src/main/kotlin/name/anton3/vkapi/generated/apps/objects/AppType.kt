package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class AppType(@get:JsonValue val value: String) {
    APP("app"),
    GAME("game"),
    SITE("site"),
    STANDALONE("standalone")
}
