package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetFilter(@get:JsonValue val value: String) {
    OWNER("owner"),
    OTHERS("others"),
    ALL("all"),
    POSTPONED("postponed"),
    SUGGESTS("suggests")
}
