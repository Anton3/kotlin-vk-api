@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.reorderAlbums]
 *
 * Reorders the album in the list of user video albums.
 *
 * @property ownerId ID of the user or community that owns the albums..
 * @property albumId Album ID.
 * @property before ID of the album before which the album in question shall be placed.
 * @property after ID of the album after which the album in question shall be placed.
 */
data class VideoReorderAlbums(
    var ownerId: Long? = null,
    var albumId: Long,
    var before: Long? = null,
    var after: Long? = null
) : VkMethod<OkResponse>(
    "video.reorderAlbums",
    jacksonTypeRef()
), UserMethod
