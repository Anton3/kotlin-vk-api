package name.alatushkin.api.vk.generated.common.objects

import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment

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
) : WallpostAttachment,
    CommentAttachment,
    MessageAttachment
