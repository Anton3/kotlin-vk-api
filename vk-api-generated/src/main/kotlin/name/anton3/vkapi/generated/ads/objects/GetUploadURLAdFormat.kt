@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetUploadURLAdFormat(override val value: Int) : ValueEnum<Int> {
    IMAGE_AND_TEXT(1),
    BIG_IMAGE(2),
    EXCLUSIVE_FORMAT(3),
    COMMUNITY_SQUARE_IMAGE(4),
    SPECIAL_APP_FORMAT(7)
}
