@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.Image
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/photos.saveOwnerCoverPhoto]
 *
 * Saves cover photo after successful uploading.
 *
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
data class PhotosSaveOwnerCoverPhoto(
    var photo: String,
    var hash: String
) : CheckedMethod<List<Image>, UserMethod>("photos.saveOwnerCoverPhoto", jacksonTypeRef())
