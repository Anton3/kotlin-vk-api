package name.anton3.vkapi.generated.search.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class HintSection(@get:JsonValue val value: String) {
    GROUPS("groups"),
    EVENTS("events"),
    PUBLICS("publics"),
    CORRESPONDENTS("correspondents"),
    PEOPLE("people"),
    FRIENDS("friends"),
    MUTUAL_FRIENDS("mutual_friends")
}
