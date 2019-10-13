@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property appRequests New app requests number
 * @property events New events number
 * @property friends New friends requests number
 * @property friendsSuggestions New friends suggestions number
 * @property gifts New gifts number
 * @property groups New groups number
 * @property messages New messages number
 * @property notifications New notifications number
 * @property photos New photo tags number
 * @property videos New video tags number
 */
data class AccountCounters(
    val appRequests: Int? = null,
    val events: Int? = null,
    val friends: Int? = null,
    val friendsSuggestions: Int? = null,
    val gifts: Int? = null,
    val groups: Int? = null,
    val messages: Int? = null,
    val notifications: Int? = null,
    val photos: Int? = null,
    val videos: Int? = null
)
