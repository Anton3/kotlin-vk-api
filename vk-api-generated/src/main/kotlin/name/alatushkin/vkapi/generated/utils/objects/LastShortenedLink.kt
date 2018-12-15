package name.alatushkin.vkapi.generated.utils.objects

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
    val timestamp: Long? = null,
    val url: String? = null,
    val shortUrl: String? = null,
    val key: String? = null,
    val views: Long? = null,
    val accessKey: String? = null
)
