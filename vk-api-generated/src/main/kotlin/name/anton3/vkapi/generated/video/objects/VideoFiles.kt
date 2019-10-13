@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * No description
 *
 * @property external URL of the external player
 * @property mp41080 URL of the mpeg4 file with 1080p quality
 * @property mp4240 URL of the mpeg4 file with 240p quality
 * @property mp4360 URL of the mpeg4 file with 360p quality
 * @property mp4480 URL of the mpeg4 file with 480p quality
 * @property mp4720 URL of the mpeg4 file with 720p quality
 */
data class VideoFiles(
    val external: String? = null,
    @get:JsonProperty("mp4_1080") val mp41080: String? = null,
    @get:JsonProperty("mp4_240") val mp4240: String? = null,
    @get:JsonProperty("mp4_360") val mp4360: String? = null,
    @get:JsonProperty("mp4_480") val mp4480: String? = null,
    @get:JsonProperty("mp4_720") val mp4720: String? = null
)
