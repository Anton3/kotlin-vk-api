@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class PrivacySettings(override val value: Int) : ValueEnum<Int> {
    COMMUNITY_MANAGERS_ONLY(0),
    COMMUNITY_MEMBERS_ONLY(1),
    EVERYONE(2)
}
