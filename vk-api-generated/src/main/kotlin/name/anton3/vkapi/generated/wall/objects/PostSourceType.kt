package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class PostSourceType(@get:JsonValue val value: String) {
    VK("vk"),
    WIDGET("widget"),
    API("api"),
    RSS("rss"),
    SMS("sms")
}
