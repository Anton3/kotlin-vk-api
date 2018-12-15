@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.putTag]
 *
 * Adds a tag on the photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property userId ID of the user to be tagged.
 * @property x Upper left-corner coordinate of the tagged area (as a percentage of the photo's width).
 * @property y Upper left-corner coordinate of the tagged area (as a percentage of the photo's height).
 * @property x2 Lower right-corner coordinate of the tagged area (as a percentage of the photo's width).
 * @property y2 Lower right-corner coordinate of the tagged area (as a percentage of the photo's height).
 */
data class PhotosPutTag(
    var ownerId: Long? = null,
    var photoId: Long,
    var userId: Long,
    var x: Double? = null,
    var y: Double? = null,
    var x2: Double? = null,
    var y2: Double? = null
) : VkMethod<Long>("photos.putTag", jacksonTypeRef()),
    UserMethod
