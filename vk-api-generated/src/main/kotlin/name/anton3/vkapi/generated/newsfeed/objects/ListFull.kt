package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property noReposts Information whether reposts hiding is enabled
 * @property sourceIds No description
 * @property id List ID
 * @property title List title
 */
@JsonDeserialize(`as` = Void::class)
data class ListFull(
    val noReposts: Boolean? = null,
    val sourceIds: List<Int>? = null,
    override val id: Int,
    override val title: String
) : ListMin
