package name.alatushkin.vkapi.generated.friends.objects

/**
 * No description
 *
 * @property userId User ID
 * @property from ID of the user by whom friend has been suggested
 * @property mutual No description
 * @property message Message sent with a request
 */
data class RequestsXtrMessage(
    val userId: Long? = null,
    val from: String? = null,
    val mutual: RequestsMutual? = null,
    val message: String? = null
)
