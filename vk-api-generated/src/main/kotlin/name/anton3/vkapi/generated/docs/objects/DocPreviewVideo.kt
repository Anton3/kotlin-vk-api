@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.objects

/**
 * No description
 *
 * @property filesize Video file size in bites
 * @property height Video's height in pixels
 * @property src Video URL
 * @property width Video's width in pixels
 */
data class DocPreviewVideo(
    val filesize: Int,
    val height: Int,
    val src: String,
    val width: Int
)
