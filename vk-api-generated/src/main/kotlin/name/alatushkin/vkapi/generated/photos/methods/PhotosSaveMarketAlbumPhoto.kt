@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.tokens.UserMethod

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
data class PhotosSaveMarketAlbumPhoto(
    var groupId: Long,
    var photo: String,
    var server: Long,
    var hash: String
) : VkMethod<List<Photo>>("photos.saveMarketAlbumPhoto", jacksonTypeRef()),
    UserMethod
