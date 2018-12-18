package name.anton3.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property src URL of the image
 * @property width Width in px
 * @property height Height in px
 * @property type No description
 */
data class PhotoSizes(
    val src: String,
    val width: Long,
    val height: Long,
    val type: PhotoSizesType
)
