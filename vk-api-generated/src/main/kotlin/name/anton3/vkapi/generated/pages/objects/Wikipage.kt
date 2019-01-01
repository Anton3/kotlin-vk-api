package name.anton3.vkapi.generated.pages.objects

/**
 * No description
 *
 * @property id Page ID
 * @property groupId Community ID
 * @property title Page title
 * @property whoCanView View settings of the page
 * @property whoCanEdit Edit settings of the page
 * @property views Views number
 * @property editorId Last editor ID
 * @property editorName Last editor name
 * @property creatorId Page creator ID
 * @property creatorName Page creator name
 */
data class Wikipage(
    val id: Int,
    val groupId: Int,
    val title: String,
    val whoCanView: PrivacySettings,
    val whoCanEdit: PrivacySettings,
    val views: Int,
    val editorId: Int? = null,
    val editorName: String? = null,
    val creatorId: Int? = null,
    val creatorName: Int? = null
)
