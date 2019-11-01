@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property created Date when the page has been created in Unixtime
 * @property creatorId Page creator ID
 * @property currentUserCanEdit Information whether current user can edit the page
 * @property currentUserCanEditAccess Information whether current user can edit the page access settings
 * @property edited Date when the page has been edited in Unixtime
 * @property editorId Last editor ID
 * @property groupId Community ID
 * @property html Page content, HTML
 * @property id Page ID
 * @property source Page content, wiki
 * @property title Page title
 * @property viewUrl URL of the page preview
 * @property views Views number
 * @property whoCanEdit Edit settings of the page
 * @property whoCanView View settings of the page
 */
@JsonDeserialize(`as` = Void::class)
data class WikipageFull(
    val created: Int,
    val creatorId: Int? = null,
    val currentUserCanEdit: BoolInt? = null,
    val currentUserCanEditAccess: BoolInt? = null,
    val edited: Int,
    val editorId: Int? = null,
    val groupId: Int,
    val html: String? = null,
    val id: Int,
    val source: String? = null,
    val title: String,
    val viewUrl: String,
    val views: Int,
    val whoCanEdit: PrivacySettings,
    val whoCanView: PrivacySettings
) : CommentAttachmentBody, WallPostAttachmentBody
