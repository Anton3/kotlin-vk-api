@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.save]
 *
 * Saves photos after successful uploading.
 *
 * @property albumId ID of the album to save photos to.
 * @property groupId ID of the community to save photos to.
 * @property server Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property photosList Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property latitude Geographical latitude, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude, in degrees (from '-180' to '180').
 * @property caption Text describing the photo. 2048 digits max.
 */
class PhotosSaveMethod(
        albumId: Long? = null,
        groupId: Long? = null,
        server: Long? = null,
        photosList: String? = null,
        hash: String? = null,
        latitude: Double? = null,
        longitude: Double? = null,
        caption: String? = null
) : VkMethod<Array<Photo>>(
    "photos.save",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<Photo>>>() {}
), UserMethod {

    var albumId: Long? by props
    var groupId: Long? by props
    var server: Long? by props
    var photosList: String? by props
    var hash: String? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var caption: String? by props

    init {
        this.albumId = albumId
        this.groupId = groupId
        this.server = server
        this.photosList = photosList
        this.hash = hash
        this.latitude = latitude
        this.longitude = longitude
        this.caption = caption
    }

    fun setAlbumId(albumId: Long): PhotosSaveMethod {
        this.albumId = albumId
        return this
    }

    fun setGroupId(groupId: Long): PhotosSaveMethod {
        this.groupId = groupId
        return this
    }

    fun setServer(server: Long): PhotosSaveMethod {
        this.server = server
        return this
    }

    fun setPhotosList(photosList: String): PhotosSaveMethod {
        this.photosList = photosList
        return this
    }

    fun setHash(hash: String): PhotosSaveMethod {
        this.hash = hash
        return this
    }

    fun setLatitude(latitude: Double): PhotosSaveMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Double): PhotosSaveMethod {
        this.longitude = longitude
        return this
    }

    fun setCaption(caption: String): PhotosSaveMethod {
        this.caption = caption
        return this
    }
}
