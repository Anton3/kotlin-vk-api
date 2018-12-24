package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetNearbyRadius(@get:JsonValue val value: String) {
    ANY("0"),
    M_300("1"),
    M_2400("2"),
    KM_18("3"),
    _150_KM_("4")
}
