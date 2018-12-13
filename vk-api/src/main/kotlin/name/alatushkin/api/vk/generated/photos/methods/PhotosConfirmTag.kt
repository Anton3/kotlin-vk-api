@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.confirmTag]
 *
 * Confirms a tag on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property tagId Tag ID.
 */
data class PhotosConfirmTag(
    var ownerId: Long? = null,
    var photoId: String,
    var tagId: Long
) : VkMethod<OkResponse>(
    "photos.confirmTag",
    jacksonTypeRef()
), UserMethod
