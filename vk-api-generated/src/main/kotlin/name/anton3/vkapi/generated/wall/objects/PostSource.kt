@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

/**
 * No description
 *
 * @property data Additional data
 * @property platform Platform name
 * @property type No description
 * @property url URL to an external site used to publish the post
 */
data class PostSource(
    val data: String? = null,
    val platform: String? = null,
    val type: PostSourceType? = null,
    val url: String? = null
)
