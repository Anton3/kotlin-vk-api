@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getOwnerPhotoUploadServer]
 *
 * Returns an upload server address for a profile or community photo.
 *
 * @property ownerId identifier of a community or current user. "Note that community id must be negative. 'owner_id=1' – user, 'owner_id=-1' – community, "
 */
data class PhotosGetOwnerPhotoUploadServer(
    var ownerId: Int? = null
) : VkMethod<UploadServer>("photos.getOwnerPhotoUploadServer", jacksonTypeRef()),
    UserMethod
