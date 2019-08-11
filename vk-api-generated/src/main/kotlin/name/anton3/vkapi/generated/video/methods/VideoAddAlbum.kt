@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.AddAlbumResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/video.addAlbum]
 *
 * Creates an empty album for videos.
 *
 * @property groupId Community ID (if the album will be created in a community).
 * @property title Album title.
 * @property privacy new access permissions for the album. Possible values: , *'0' – all users,, *'1' – friends only,, *'2' – friends and friends of friends,, *'3' – "only me".
 */
data class VideoAddAlbum(
    var groupId: Int? = null,
    var title: String? = null,
    var privacy: List<String>? = null
) : CheckedMethod<AddAlbumResponse, UserMethod>("video.addAlbum", jacksonTypeRef())
