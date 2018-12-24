package name.anton3.vkapi.generated.places.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchRadius(@get:JsonValue val value: String) {
    M_100("1"),
    M_800("2"),
    KM_6("3"),
    KM_50("4")
}
