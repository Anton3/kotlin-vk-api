@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.copy]
 *
 * Allows to copy a photo to the "Saved photos" album
 *
 * @property ownerId photo's owner ID
 * @property photoId photo ID
 * @property accessKey for private photos
 */
data class PhotosCopy(
    var ownerId: Long,
    var photoId: Long,
    var accessKey: String? = null
) : VkMethod<Long>("photos.copy", jacksonTypeRef()),
    UserMethod
