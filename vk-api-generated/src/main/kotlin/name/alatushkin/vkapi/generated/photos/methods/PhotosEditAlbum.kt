@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.editAlbum]
 *
 * Edits information about a photo album.
 *
 * @property albumId ID of the photo album to be edited.
 * @property title New album title.
 * @property description New album description.
 * @property ownerId ID of the user or community that owns the album.
 * @property privacyView No description
 * @property privacyComment No description
 * @property uploadByAdminsOnly No description
 * @property commentsDisabled No description
 */
data class PhotosEditAlbum(
    var albumId: Long,
    var title: String? = null,
    var description: String? = null,
    var ownerId: Long? = null,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null,
    var uploadByAdminsOnly: Boolean? = null,
    var commentsDisabled: Boolean? = null
) : VkMethod<OkResponse>("photos.editAlbum", jacksonTypeRef()),
    UserMethod
