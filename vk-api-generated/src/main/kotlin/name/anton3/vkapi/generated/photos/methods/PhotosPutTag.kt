@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

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
    var ownerId: Int? = null,
    var photoId: Int,
    var userId: Int,
    var x: Double? = null,
    var y: Double? = null,
    var x2: Double? = null,
    var y2: Double? = null
) : CheckedMethod<Int, UserMethod>("photos.putTag", jacksonTypeRef())
