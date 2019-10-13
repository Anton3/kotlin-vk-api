@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property amount Amount
 * @property appOrderId App order ID
 * @property cancelTransactionId Cancel transaction ID
 * @property date Date of creation in Unixtime
 * @property id Order ID
 * @property item Order item
 * @property receiverId Receiver ID
 * @property status Order status
 * @property transactionId Transaction ID
 * @property userId User ID
 */
data class Order(
    val amount: Int? = null,
    val appOrderId: Int? = null,
    val cancelTransactionId: Int? = null,
    val date: VkDate? = null,
    val id: Int? = null,
    val item: String? = null,
    val receiverId: Int? = null,
    val status: String? = null,
    val transactionId: Int? = null,
    val userId: Int? = null
)
