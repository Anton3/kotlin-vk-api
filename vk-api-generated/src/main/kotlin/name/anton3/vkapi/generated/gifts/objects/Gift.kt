package name.anton3.vkapi.generated.gifts.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Gift ID
 * @property fromId Gift sender ID
 * @property message Comment text
 * @property date Date when gist has been sent in Unixtime
 * @property gift No description
 * @property privacy No description
 * @property giftHash Hash
 */
data class Gift(
    val id: Int? = null,
    val fromId: Int? = null,
    val message: String? = null,
    val date: VkDate? = null,
    val gift: Layout? = null,
    val privacy: GiftPrivacy? = null,
    val giftHash: String? = null
)
