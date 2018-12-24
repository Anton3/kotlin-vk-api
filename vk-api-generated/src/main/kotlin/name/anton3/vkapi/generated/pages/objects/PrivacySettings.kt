package name.anton3.vkapi.generated.pages.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class PrivacySettings(@get:JsonValue val value: String) {
    COMMUNITY_MANAGERS_ONLY("0"),
    COMMUNITY_MEMBERS_ONLY("1"),
    EVERYONE("2")
}
