package name.anton3.vkapi.generated.database.objects

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
data class City(
    val area: String? = null,
    val region: String? = null,
    val important: Boolean? = null,
    override val id: Long,
    override val title: String
) : Object
