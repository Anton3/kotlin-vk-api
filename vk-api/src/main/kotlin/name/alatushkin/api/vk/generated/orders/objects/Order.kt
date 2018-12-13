package name.alatushkin.api.vk.generated.orders.objects

import name.alatushkin.api.vk.vktypes.VkDate

data class Order(
    val id: Long? = null,
    val appOrderId: Long? = null,
    val status: String? = null,
    val userId: Long? = null,
    val receiverId: Long? = null,
    val item: String? = null,
    val amount: Long? = null,
    val date: VkDate? = null,
    val transactionId: Long? = null,
    val cancelTransactionId: Long? = null
)
