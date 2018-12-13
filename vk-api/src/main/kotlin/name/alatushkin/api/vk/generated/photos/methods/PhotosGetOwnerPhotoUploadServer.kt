@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getOwnerPhotoUploadServer]
 *
 * Returns an upload server address for a profile or community photo.
 *
 * @property ownerId identifier of a community or current user. "Note that community id must be negative. 'owner_id=1' – user, 'owner_id=-1' – community, "
 */
data class PhotosGetOwnerPhotoUploadServer(
    var ownerId: Long? = null
) : VkMethod<UploadServer>(
    "photos.getOwnerPhotoUploadServer",
    jacksonTypeRef()
), UserMethod
