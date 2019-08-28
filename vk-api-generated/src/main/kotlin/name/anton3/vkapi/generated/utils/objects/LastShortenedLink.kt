@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property timestamp Creation time in Unixtime
 * @property url Full URL
 * @property shortUrl Short link URL
 * @property key Link key (characters after vk.cc/)
 * @property views Total views number
 * @property accessKey Access key for private stats
 */
data class LastShortenedLink(
    val timestamp: VkDate? = null,
    val url: String? = null,
    val shortUrl: String? = null,
    val key: String? = null,
    val views: Int? = null,
    val accessKey: String? = null
)
