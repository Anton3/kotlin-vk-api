package name.alatushkin.api.vk.generated.gifts.objects

import name.alatushkin.api.vk.vktypes.VkDate

data class Gift(
    val id: Long? = null,
    val fromId: Long? = null,
    val message: String? = null,
    val date: VkDate? = null,
    val gift: Layout? = null,
    val privacy: GiftPrivacy? = null,
    val giftHash: String? = null
)
