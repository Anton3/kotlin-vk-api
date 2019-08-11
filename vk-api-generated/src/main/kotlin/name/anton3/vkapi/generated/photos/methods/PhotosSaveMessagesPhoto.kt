@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/photos.saveMessagesPhoto]
 *
 * Saves a photo after being successfully uploaded. URL obtained with [vk.com/dev/photos.getMessagesUploadServer|photos.getMessagesUploadServer] method.
 *
 * @property photo Parameter returned when the photo is [vk.com/dev/upload_files|uploaded to the server].
 * @property server No description
 * @property hash No description
 */
data class PhotosSaveMessagesPhoto(
    var photo: String,
    var server: Int? = null,
    var hash: String? = null
) : CheckedMethod<List<Photo>, UserGroupMethod>("photos.saveMessagesPhoto", jacksonTypeRef())
