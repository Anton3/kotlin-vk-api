package name.alatushkin.vkapi.generated.video.objects

/**
 * No description
 *
 * @property items No description
 * @property next New value for _from_ parameter
 */
data class GetCatalogResponse(
    val items: List<CatBlock>,
    val next: String
)
