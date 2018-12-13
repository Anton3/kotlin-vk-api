@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.video.objects.SearchSort
import name.alatushkin.api.vk.generated.video.objects.Video
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/video.search]
 *
 * Returns a list of videos under the set search criterion.
 *
 * @property q Search query string (e.g., 'The Beatles').
 * @property sort Sort order: '1' — by duration, '2' — by relevance, '0' — by date added
 * @property hd If not null, only searches for high-definition videos.
 * @property adult '1' — to disable the Safe Search filter, '0' — to enable the Safe Search filter
 * @property filters Filters to apply: 'youtube' — return YouTube videos only, 'vimeo' — return Vimeo videos only, 'short' — return short videos only, 'long' — return long videos only
 * @property searchOwn 
 * @property offset Offset needed to return a specific subset of videos.
 * @property longer 
 * @property shorter 
 * @property count Number of videos to return.
 */
data class VideoSearch(
    var q: String,
    var sort: SearchSort? = null,
    var hd: Long? = null,
    var adult: Boolean? = null,
    var filters: List<String>? = null,
    var searchOwn: Boolean? = null,
    var offset: Long? = null,
    var longer: Long? = null,
    var shorter: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Video>>(
    "video.search",
    jacksonTypeRef()
), UserMethod
