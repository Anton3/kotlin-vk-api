package name.alatushkin.vkapi.generated.video.objects

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
    val videoId: Long? = null,
    val ownerId: Long? = null,
    val title: String? = null,
    val description: String? = null
)
