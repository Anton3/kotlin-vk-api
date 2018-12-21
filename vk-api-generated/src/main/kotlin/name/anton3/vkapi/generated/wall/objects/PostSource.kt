package name.anton3.vkapi.generated.wall.objects

/**
 * No description
 *
 * @property type No description
 * @property platform Platform name
 * @property data Additional data
 * @property url URL to an external site used to publish the post
 */
data class PostSource(
    val type: PostSourceType? = null,
    val platform: String? = null,
    val data: String? = null,
    val url: String? = null
)
