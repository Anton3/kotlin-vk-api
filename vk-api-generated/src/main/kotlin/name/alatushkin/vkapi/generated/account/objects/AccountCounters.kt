package name.alatushkin.vkapi.generated.account.objects

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
    val friends: Long? = null,
    val messages: Long? = null,
    val photos: Long? = null,
    val videos: Long? = null,
    val gifts: Long? = null,
    val events: Long? = null,
    val groups: Long? = null,
    val notifications: Long? = null,
    val appRequests: Long? = null,
    val friendsSuggestions: Long? = null
)
