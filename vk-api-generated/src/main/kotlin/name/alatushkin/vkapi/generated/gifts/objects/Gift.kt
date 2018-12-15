package name.alatushkin.vkapi.generated.gifts.objects

import name.alatushkin.vkapi.vktypes.VkDate

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
    val id: Long? = null,
    val fromId: Long? = null,
    val message: String? = null,
    val date: VkDate? = null,
    val gift: Layout? = null,
    val privacy: GiftPrivacy? = null,
    val giftHash: String? = null
)
