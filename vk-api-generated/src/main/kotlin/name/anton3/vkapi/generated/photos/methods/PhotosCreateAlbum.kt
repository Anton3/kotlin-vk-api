@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.photos.objects.PhotoAlbumFull
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.createAlbum]
 *
 * Creates an empty photo album.
 *
 * @property title Album title.
 * @property groupId ID of the community in which the album will be created.
 * @property description Album description.
 * @property privacyView No description
 * @property privacyComment No description
 * @property uploadByAdminsOnly No description
 * @property commentsDisabled No description
 */
data class PhotosCreateAlbum(
    var title: String,
    var groupId: Int? = null,
    var description: String? = null,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null,
    var uploadByAdminsOnly: Boolean? = null,
    var commentsDisabled: Boolean? = null
) : VkMethod<PhotoAlbumFull>("photos.createAlbum", jacksonTypeRef()),
    UserMethod
