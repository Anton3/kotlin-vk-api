package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CheckLinkLinkType(@get:JsonValue val value: String) {
    COMMUNITY("community"),
    POST("post"),
    APPLICATION("application"),
    VIDEO("video"),
    SITE("site")
}
