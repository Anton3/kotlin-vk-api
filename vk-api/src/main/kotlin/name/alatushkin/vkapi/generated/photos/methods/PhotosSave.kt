@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.tokens.UserMethod

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
data class PhotosSave(
    var albumId: Long? = null,
    var groupId: Long? = null,
    var server: Long? = null,
    var photosList: String? = null,
    var hash: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var caption: String? = null
) : VkMethod<List<Photo>>(
    "photos.save",
    jacksonTypeRef()
), UserMethod
