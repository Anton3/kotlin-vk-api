@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

/**
 * No description
 *
 * @property accessKey Video access key
 * @property description Video description
 * @property ownerId Video owner ID
 * @property title Video title
 * @property uploadUrl URL for the video uploading
 * @property videoId Video ID
 */
data class SaveResult(
    val accessKey: String? = null,
    val description: String? = null,
    val ownerId: Int? = null,
    val title: String? = null,
    val uploadUrl: String? = null,
    val videoId: Int? = null
)
