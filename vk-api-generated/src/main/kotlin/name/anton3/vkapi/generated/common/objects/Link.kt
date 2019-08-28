@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property target No description
 * @property isExternal No description
 * @property url Link URL
 * @property title Link title
 * @property caption Link caption
 * @property description Link description
 * @property photo No description
 * @property previewUrl URL of the page with article preview
 * @property previewPage String ID of the page with article preview
 * @property button No description
 * @property product No description
 * @property rating No description
 * @property application No description
 */
@JsonDeserialize(`as` = Void::class)
data class Link(
    val target: LinkTarget? = null,
    val isExternal: BoolInt? = null,
    val url: String,
    val title: String? = null,
    val caption: String? = null,
    val description: String? = null,
    val photo: Photo? = null,
    val previewUrl: String? = null,
    val previewPage: String? = null,
    val button: LinkButton? = null,
    val product: LinkProduct? = null,
    val rating: LinkRating? = null,
    val application: LinkApplication? = null
) : WallPostAttachmentBody, CommentAttachmentBody, MessageAttachmentBody
