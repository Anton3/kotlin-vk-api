@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class LinkButtonActionType(override val value: String) : ValueEnum<String> {
    OPEN_URL("open_url"),
    JOIN_GROUP_AND_OPEN_URL("join_group_and_open_url")
}
