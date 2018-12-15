package name.alatushkin.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class GetFilter(@JsonValue val jsonValue: String) {
    OWNER("owner"),
    OTHERS("others"),
    ALL("all"),
    POSTPONED("postponed"),
    SUGGESTS("suggests");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetFilter =
            GetFilter.values().find { it.jsonValue == value }!!
    }
}
