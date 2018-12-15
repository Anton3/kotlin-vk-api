@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.AddAlbumResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
    var groupId: Long? = null,
    var title: String? = null,
    var privacy: List<String>? = null
) : VkMethod<AddAlbumResponse>("video.addAlbum", jacksonTypeRef()),
    UserMethod
