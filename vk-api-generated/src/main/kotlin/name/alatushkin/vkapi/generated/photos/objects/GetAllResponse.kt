package name.alatushkin.vkapi.generated.photos.objects

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property more Information whether next page is presented
 */
data class GetAllResponse(
    val count: Long? = null,
    val items: List<PhotoXtrRealOffset>? = null,
    val more: Boolean? = null
)
