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
    val id: Int? = null,
    val country: Int? = null,
    val city: Int? = null,
    val name: String? = null,
    val faculty: Int? = null,
    val facultyName: String? = null,
    val chair: Int? = null,
    val chairName: String? = null,
    val graduation: Int? = null,
    val educationForm: String? = null,
    val educationStatus: String? = null
)
