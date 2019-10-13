@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.Image
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.saveOwnerCoverPhoto]
 *
 * Saves cover photo after successful uploading.
 *
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
data class PhotosSaveOwnerCoverPhoto(
    var hash: String,
    var photo: String
) : VkMethod<List<Image>, UserGroupMethod>("photos.saveOwnerCoverPhoto", jacksonTypeRef())
