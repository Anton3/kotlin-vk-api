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
    val id: Long? = null,
    val length: Long? = null,
    val edited: Long? = null,
    val editorId: Long? = null,
    val editorName: String? = null
)
