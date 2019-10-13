@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property accessKey Access key for graffiti
 * @property height Graffiti height
 * @property id Graffiti ID
 * @property ownerId Graffiti owner ID
 * @property url Graffiti URL
 * @property width Graffiti width
 */
data class Graffiti(
    val accessKey: String? = null,
    val height: Int,
    val id: Int,
    val ownerId: Int,
    val url: String,
    val width: Int
)
