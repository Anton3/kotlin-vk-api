package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class SearchSex(@get:JsonValue val value: String) {
    ANY("0"),
    FEMALE("1"),
    MALE("2")
}
