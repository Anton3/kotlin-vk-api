package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property id University ID
 * @property country Country ID
 * @property city City ID
 * @property name University name
 * @property faculty Faculty ID
 * @property facultyName Faculty name
 * @property chair Chair ID
 * @property chairName Chair name
 * @property graduation Graduation year
 * @property educationForm Education form
 * @property educationStatus Education status
 */
data class University(
    val id: Long? = null,
    val country: Long? = null,
    val city: Long? = null,
    val name: String? = null,
    val faculty: Long? = null,
    val facultyName: String? = null,
    val chair: Long? = null,
    val chairName: String? = null,
    val graduation: Long? = null,
    val educationForm: String? = null,
    val educationStatus: String? = null
)
