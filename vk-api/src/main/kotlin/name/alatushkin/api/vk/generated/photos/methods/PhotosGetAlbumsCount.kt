@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getAlbumsCount]
 *
 * Returns the number of photo albums belonging to a user or community.
 *
 * @property userId User ID.
 * @property groupId Community ID.
 */
data class PhotosGetAlbumsCount(
    var userId: Long? = null,
    var groupId: Long? = null
) : VkMethod<Long>(
    "photos.getAlbumsCount",
    jacksonTypeRef()
), UserMethod
