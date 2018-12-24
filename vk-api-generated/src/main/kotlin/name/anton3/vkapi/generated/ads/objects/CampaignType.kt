package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class CampaignType(@JsonValue override val value: String) : Value<String> {
    NORMAL("normal"),
    VK_APPS_MANAGED("vk_apps_managed"),
    MOBILE_APPS("mobile_apps"),
    PROMOTED_POSTS("promoted_posts");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): CampaignType = parseEnum(value)
    }
}
