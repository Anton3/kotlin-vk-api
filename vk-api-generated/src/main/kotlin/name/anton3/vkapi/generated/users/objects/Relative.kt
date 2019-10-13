@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property birthDate Date of child birthday (format dd.mm.yyyy)
 * @property id Relative ID
 * @property name Name of relative
 * @property type Relative type
 */
data class Relative(
    val birthDate: String? = null,
    val id: Int? = null,
    val name: String? = null,
    val type: RelativeType
)
