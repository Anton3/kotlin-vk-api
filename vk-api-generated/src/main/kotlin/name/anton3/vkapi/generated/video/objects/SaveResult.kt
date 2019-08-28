@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

/**
 * No description
 *
 * @property uploadUrl URL for the video uploading
 * @property videoId Video ID
 * @property ownerId Video owner ID
 * @property title Video title
 * @property description Video description
 */
data class SaveResult(
    val uploadUrl: String? = null,
    val videoId: Int? = null,
    val ownerId: Int? = null,
    val title: String? = null,
    val description: String? = null
)
