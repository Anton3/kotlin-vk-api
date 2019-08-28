@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.gifts.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GiftPrivacy(override val value: Int) : ValueEnum<Int> {
    NAME_AND_MESSAGE_FOR_ALL(0),
    NAME_FOR_ALL(1),
    NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY(2)
}
