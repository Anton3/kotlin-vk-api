@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

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
) : VkMethod<Long>("photos.getAlbumsCount", jacksonTypeRef()),
    UserMethod
