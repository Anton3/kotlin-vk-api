package name.anton3.vkapi.generated.database.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Object

/**
 * No description
 *
 * @property area Area title
 * @property region Region title
 * @property important Information whether the city is included in important cities list
 * @property id Object ID
 * @property title Object title
 */
@JsonDeserialize(`as` = Void::class)
data class City(
    val area: String? = null,
    val region: String? = null,
    val important: Boolean? = null,
    override val id: Int,
    override val title: String
) : Object
