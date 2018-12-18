@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.editAlbum]
 *
 * Edits the title of a video album.
 *
 * @property groupId Community ID (if the album edited is owned by a community).
 * @property albumId Album ID.
 * @property title New album title.
 * @property privacy new access permissions for the album. Possible values: , *'0' – all users,, *'1' – friends only,, *'2' – friends and friends of friends,, *'3' – "only me".
 */
data class VideoEditAlbum(
    var groupId: Long? = null,
    var albumId: Long,
    var title: String,
    var privacy: List<String>? = null
) : VkMethod<OkResponse>("video.editAlbum", jacksonTypeRef()),
    UserMethod
