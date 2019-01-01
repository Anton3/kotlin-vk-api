package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property friends New friends requests number
 * @property messages New messages number
 * @property photos New photo tags number
 * @property videos New video tags number
 * @property gifts New gifts number
 * @property events New events number
 * @property groups New groups number
 * @property notifications New notifications number
 * @property appRequests New app requests number
 * @property friendsSuggestions New friends suggestions number
 */
data class AccountCounters(
    val friends: Int? = null,
    val messages: Int? = null,
    val photos: Int? = null,
    val videos: Int? = null,
    val gifts: Int? = null,
    val events: Int? = null,
    val groups: Int? = null,
    val notifications: Int? = null,
    val appRequests: Int? = null,
    val friendsSuggestions: Int? = null
)
