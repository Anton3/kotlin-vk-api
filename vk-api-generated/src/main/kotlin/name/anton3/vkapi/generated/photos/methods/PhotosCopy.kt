@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

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
) : CheckedMethod<Int, UserMethod>("photos.copy", jacksonTypeRef())
