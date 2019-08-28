@file:Suppress("unused", "SpellCheckingInspection")

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
    val id: Int? = null,
    val appOrderId: Int? = null,
    val status: String? = null,
    val userId: Int? = null,
    val receiverId: Int? = null,
    val item: String? = null,
    val amount: Int? = null,
    val date: VkDate? = null,
    val transactionId: Int? = null,
    val cancelTransactionId: Int? = null
)
