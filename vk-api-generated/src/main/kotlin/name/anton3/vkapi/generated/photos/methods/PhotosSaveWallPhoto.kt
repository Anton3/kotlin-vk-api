@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/photos.saveWallPhoto]
 *
 * Saves a photo to a user's or community's wall after being uploaded.
 *
 * @property userId ID of the user on whose wall the photo will be saved.
 * @property groupId ID of community on whose wall the photo will be saved.
 * @property photo Parameter returned when the the photo is [vk.com/dev/upload_files|uploaded to the server].
 * @property server No description
 * @property hash No description
 * @property latitude Geographical latitude, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude, in degrees (from '-180' to '180').
 * @property caption Text describing the photo. 2048 digits max.
 */
data class PhotosSaveWallPhoto(
    var userId: Int? = null,
    var groupId: Int? = null,
    var photo: String,
    var server: Int? = null,
    var hash: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var caption: String? = null
) : CheckedMethod<List<Photo>, UserMethod>("photos.saveWallPhoto", jacksonTypeRef())
