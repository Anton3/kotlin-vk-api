@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.saveMarketPhoto]
 *
 * Saves market photos after successful uploading.
 *
 * @property groupId Community ID.
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property server Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property cropData Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property cropHash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
data class PhotosSaveMarketPhoto(
    var groupId: Int? = null,
    var photo: String,
    var server: Int,
    var hash: String,
    var cropData: String? = null,
    var cropHash: String? = null
) : VkMethod<List<Photo>, UserMethod>("photos.saveMarketPhoto", jacksonTypeRef())
