package name.alatushkin.vkapi.generated.newsfeed.objects

/**
 * No description
 *
 * @property noReposts Information whether reposts hiding is enabled
 * @property sourceIds No description
 * @property id List ID
 * @property title List title
 */
data class ListFull(
    val noReposts: Boolean? = null,
    val sourceIds: List<Long>? = null,
    override val id: Long,
    override val title: String
) : ListMin
