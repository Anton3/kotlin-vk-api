@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class PostSourceType(override val value: String) : ValueEnum<String> {
    VK("vk"),
    WIDGET("widget"),
    API("api"),
    RSS("rss"),
    SMS("sms"),
    MVK("mvk")
}
