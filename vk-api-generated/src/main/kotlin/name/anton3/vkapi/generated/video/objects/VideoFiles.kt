package name.anton3.vkapi.generated.video.objects

/**
 * No description
 *
 * @property mp240 URL of the mpeg4 file with 240p quality
 * @property mp360 URL of the mpeg4 file with 360p quality
 * @property mp480 URL of the mpeg4 file with 480p quality
 * @property mp720 URL of the mpeg4 file with 720p quality
 * @property mp1080 URL of the mpeg4 file with 1080p quality
 * @property external URL of the external player
 */
data class VideoFiles(
    val mp240: String? = null,
    val mp360: String? = null,
    val mp480: String? = null,
    val mp720: String? = null,
    val mp1080: String? = null,
    val external: String? = null
)
