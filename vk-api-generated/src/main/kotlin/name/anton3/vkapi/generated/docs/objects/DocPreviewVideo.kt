@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.objects

/**
 * No description
 *
 * @property src Video URL
 * @property width Video's width in pixels
 * @property height Video's height in pixels
 * @property filesize Video file size in bites
 */
data class DocPreviewVideo(
    val src: String,
    val width: Int,
    val height: Int,
    val filesize: Int
)
