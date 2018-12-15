package name.alatushkin.vkapi.generated.common.objects

import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment

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
data class Link(
    val target: LinkTarget? = null,
    val isExternal: Boolean? = null,
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
) : WallpostAttachment,
    CommentAttachment,
    MessageAttachment
