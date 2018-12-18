package name.anton3.vkapi.generated.pages.objects

import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment

/**
 * No description
 *
 * @property id Page ID
 * @property groupId Community ID
 * @property title Page title
 * @property currentUserCanEdit Information whether current user can edit the page
 * @property currentUserCanEditAccess Information whether current user can edit the page access settings
 * @property whoCanView View settings of the page
 * @property whoCanEdit Edit settings of the page
 * @property edited Date when the page has been edited in Unixtime
 * @property created Date when the page has been created in Unixtime
 * @property views Views number
 * @property editorId Last editor ID
 * @property creatorId Page creator ID
 * @property source Page content, wiki
 * @property html Page content, HTML
 * @property viewUrl URL of the page preview
 */
data class WikipageFull(
    val id: Long,
    val groupId: Long,
    val title: String,
    val currentUserCanEdit: Boolean? = null,
    val currentUserCanEditAccess: Boolean? = null,
    val whoCanView: PrivacySettings,
    val whoCanEdit: PrivacySettings,
    val edited: Long,
    val created: Long,
    val views: Long,
    val editorId: Long? = null,
    val creatorId: Long? = null,
    val source: String? = null,
    val html: String? = null,
    val viewUrl: String
) : WallpostAttachment,
    CommentAttachment
