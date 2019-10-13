@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property cancelReason Cancel reason
 * @property createTime Date of creation in Unixtime
 * @property id Subscription ID
 * @property itemId Subscription order item
 * @property nextBillTime Date of next bill in Unixtime
 * @property pendingCancel Pending cancel state
 * @property period Subscription period
 * @property periodStartTime Date of last period start in Unixtime
 * @property price Subscription price
 * @property status Subscription status
 * @property testMode Is test subscription
 * @property trialExpireTime Date of trial expire in Unixtime
 * @property updateTime Date of last change in Unixtime
 */
data class Subscription(
    val cancelReason: String? = null,
    val createTime: Int,
    val id: Int,
    val itemId: String,
    val nextBillTime: Int? = null,
    val pendingCancel: Boolean? = null,
    val period: Int,
    val periodStartTime: Int,
    val price: Int,
    val status: String,
    val testMode: Boolean? = null,
    val trialExpireTime: Int? = null,
    val updateTime: VkDate
)
