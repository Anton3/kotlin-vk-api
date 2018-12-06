@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveMarketAlbumPhoto]
 *
 * Saves market album photos after successful uploading.
 *
 * @property groupId Community ID.
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property server Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
class PhotosSaveMarketAlbumPhotoMethod(
    groupId: Long,
    photo: String,
    server: Long,
    hash: String
) : VkMethod<Array<Photo>>(
    "photos.saveMarketAlbumPhoto",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var photo: String by props
    var server: Long by props
    var hash: String by props

    init {
        this.groupId = groupId
        this.photo = photo
        this.server = server
        this.hash = hash
    }
}
