package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class TargSuggestionsSchoolsType(@get:JsonValue val value: String) {
    SCHOOL("school"),
    UNIVERSITY("university"),
    FACULTY("faculty"),
    CHAIR("chair")
}
