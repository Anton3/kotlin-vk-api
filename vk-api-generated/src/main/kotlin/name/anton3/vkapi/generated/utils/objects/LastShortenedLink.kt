@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Access key for private stats
 * @property key Link key (characters after vk.cc/)
 * @property shortUrl Short link URL
 * @property timestamp Creation time in Unixtime
 * @property url Full URL
 * @property views Total views number
 */
data class LastShortenedLink(
    val accessKey: String? = null,
    val key: String? = null,
    val shortUrl: String? = null,
    val timestamp: VkDate? = null,
    val url: String? = null,
    val views: Int? = null
)
