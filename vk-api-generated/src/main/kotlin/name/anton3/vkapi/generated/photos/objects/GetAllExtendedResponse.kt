package name.anton3.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property more Information whether next page is presented
 */
data class GetAllExtendedResponse(
    val count: Int? = null,
    val items: List<PhotoFullXtrRealOffset>? = null,
    val more: Boolean? = null
)
