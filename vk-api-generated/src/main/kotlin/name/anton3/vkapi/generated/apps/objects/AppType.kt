@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class AppType(override val value: String) : ValueEnum<String> {
    APP("app"),
    GAME("game"),
    SITE("site"),
    STANDALONE("standalone"),
    VK_APP("vk_app"),
    COMMUNITY_APP("community_app"),
    HTML5_GAME("html5_game")
}
