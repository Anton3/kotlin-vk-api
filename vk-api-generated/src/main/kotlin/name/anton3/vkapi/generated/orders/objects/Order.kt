package name.anton3.vkapi.generated.orders.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Order ID
 * @property appOrderId App order ID
 * @property status Order status
 * @property userId User ID
 * @property receiverId Receiver ID
 * @property item Order item
 * @property amount Amount
 * @property date Date of creation in Unixtime
 * @property transactionId Transaction ID
 * @property cancelTransactionId Cancel transaction ID
 */
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
