package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id List ID
 * @property title List title
 */
@JsonDeserialize(`as` = Void::class)
data class ListMinImpl(
    override val id: Int,
    override val title: String
) : ListMin
