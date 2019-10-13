@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.objects

/**
 * No description
 *
 * @property creatorId Page creator ID
 * @property creatorName Page creator name
 * @property editorId Last editor ID
 * @property editorName Last editor name
 * @property groupId Community ID
 * @property id Page ID
 * @property title Page title
 * @property views Views number
 * @property whoCanEdit No description
 * @property whoCanView No description
 */
data class Wikipage(
    val creatorId: Int? = null,
    val creatorName: Int? = null,
    val editorId: Int? = null,
    val editorName: String? = null,
    val groupId: Int,
    val id: Int,
    val title: String,
    val views: Int,
    val whoCanEdit: PrivacySettings,
    val whoCanView: PrivacySettings
)
