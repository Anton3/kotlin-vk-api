package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id List ID
 * @property title List title
 */
@JsonDeserialize(`as` = ListMinImpl::class)
interface ListMin {
    val id: Long
    val title: String
}
