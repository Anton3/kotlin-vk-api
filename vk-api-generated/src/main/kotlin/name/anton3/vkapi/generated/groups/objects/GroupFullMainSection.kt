package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupFullMainSection(@get:JsonValue val value: String) {
    ABSENT("0"),
    PHOTOS("1"),
    TOPICS("2"),
    AUDIO("3"),
    VIDEO("4"),
    MARKET("5")
}
