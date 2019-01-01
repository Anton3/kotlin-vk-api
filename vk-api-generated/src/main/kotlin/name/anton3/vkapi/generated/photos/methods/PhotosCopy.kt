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
    var ownerId: Int,
    var photoId: Int,
    var accessKey: String? = null
) : VkMethod<Int>("photos.copy", jacksonTypeRef()),
    UserMethod
