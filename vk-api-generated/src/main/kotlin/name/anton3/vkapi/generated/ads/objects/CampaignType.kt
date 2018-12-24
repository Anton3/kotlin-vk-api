package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class CampaignType(@get:JsonValue val value: String) {
    NORMAL("normal"),
    VK_APPS_MANAGED("vk_apps_managed"),
    MOBILE_APPS("mobile_apps"),
    PROMOTED_POSTS("promoted_posts")
}
