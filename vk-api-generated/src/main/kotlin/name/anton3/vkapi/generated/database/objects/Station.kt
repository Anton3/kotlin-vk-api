@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.objects

/**
 * No description
 *
 * @property cityId City ID
 * @property color Hex color code without #
 * @property id Station ID
 * @property name Station name
 */
data class Station(
    val cityId: Int? = null,
    val color: String? = null,
    val id: Int,
    val name: String
)
