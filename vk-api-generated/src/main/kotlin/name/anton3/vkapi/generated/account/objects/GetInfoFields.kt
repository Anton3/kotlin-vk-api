@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetInfoFields(override val value: String) : ValueEnum<String> {
    COUNTRY("country"),
    HTTPS_REQUIRED("https_required"),
    OWN_POSTS_DEFAULT("own_posts_default"),
    NO_WALL_REPLIES("no_wall_replies"),
    INTRO("intro"),
    LANG("lang")
}
