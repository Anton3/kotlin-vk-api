@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.gifts.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property date Date when gist has been sent in Unixtime
 * @property fromId Gift sender ID
 * @property gift No description
 * @property giftHash Hash
 * @property id Gift ID
 * @property message Comment text
 * @property privacy No description
 */
data class Gift(
    val date: VkDate? = null,
    val fromId: Int? = null,
    val gift: Layout? = null,
    val giftHash: String? = null,
    val id: Int? = null,
    val message: String? = null,
    val privacy: GiftPrivacy? = null
)
