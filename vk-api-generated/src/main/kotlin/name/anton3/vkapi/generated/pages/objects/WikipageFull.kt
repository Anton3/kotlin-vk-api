@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.vktypes.BoolInt

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
@JsonDeserialize(`as` = Void::class)
data class WikipageFull(
    val id: Int,
    val groupId: Int,
    val title: String,
    val currentUserCanEdit: BoolInt? = null,
    val currentUserCanEditAccess: BoolInt? = null,
    val whoCanView: PrivacySettings,
    val whoCanEdit: PrivacySettings,
    val edited: Int,
    val created: Int,
    val views: Int,
    val editorId: Int? = null,
    val creatorId: Int? = null,
    val source: String? = null,
    val html: String? = null,
    val viewUrl: String
) : WallPostAttachmentBody, CommentAttachmentBody
