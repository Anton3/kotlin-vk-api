package name.anton3.vkapi.generated.pages.objects

/**
 * No description
 *
 * @property id Version ID
 * @property length Page size in bytes
 * @property edited Date when the page has been edited in Unixtime
 * @property editorId Last editor ID
 * @property editorName Last editor name
 */
data class WikipageVersion(
    val id: Int? = null,
    val length: Int? = null,
    val edited: Int? = null,
    val editorId: Int? = null,
    val editorName: String? = null
)
