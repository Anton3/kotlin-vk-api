package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id Object ID
 * @property title Object title
 */
@JsonDeserialize(`as` = Void::class)
data class ObjectImpl(
    override val id: Int,
    override val title: String
) : Object
