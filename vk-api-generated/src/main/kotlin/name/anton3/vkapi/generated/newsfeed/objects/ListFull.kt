@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.BoolInt

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
    val noReposts: BoolInt? = null,
    val sourceIds: List<Int>? = null,
    override val id: Int,
    override val title: String
) : ListMin
