@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class LinkCheckedStatus(override val value: String) : ValueEnum<String> {
    NOT_BANNED("not_banned"),
    BANNED("banned"),
    PROCESSING("processing")
}
