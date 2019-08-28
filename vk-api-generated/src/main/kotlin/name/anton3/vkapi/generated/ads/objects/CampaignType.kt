@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class CampaignType(override val value: String) : ValueEnum<String> {
    NORMAL("normal"),
    VK_APPS_MANAGED("vk_apps_managed"),
    MOBILE_APPS("mobile_apps"),
    PROMOTED_POSTS("promoted_posts")
}
