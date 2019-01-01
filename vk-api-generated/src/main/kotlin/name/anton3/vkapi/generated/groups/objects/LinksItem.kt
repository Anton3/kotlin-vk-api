package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property id Link ID
 * @property url Link URL
 * @property editTitle Information whether the link title can be edited
 * @property name Link title
 * @property desc Link description
 * @property photo50 URL of square image of the link with 50 pixels in width
 * @property photo100 URL of square image of the link with 100 pixels in width
 */
data class LinksItem(
    val id: Int? = null,
    val url: String? = null,
    val editTitle: Boolean? = null,
    val name: String? = null,
    val desc: String? = null,
    val photo50: String? = null,
    val photo100: String? = null
)
