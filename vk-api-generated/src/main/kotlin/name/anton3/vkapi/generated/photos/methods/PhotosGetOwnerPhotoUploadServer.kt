@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.getOwnerPhotoUploadServer]
 *
 * Returns an upload server address for a profile or community photo.
 *
 * @property ownerId identifier of a community or current user. "Note that community id must be negative. 'owner_id=1' – user, 'owner_id=-1' – community, "
 */
data class PhotosGetOwnerPhotoUploadServer(
    var ownerId: Int? = null
) : VkMethod<UploadServer, UserMethod>("photos.getOwnerPhotoUploadServer", jacksonTypeRef())
