@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.search.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property type No description
 * @property section No description
 * @property description Object description
 * @property global Information whether the object has been found globally
 * @property group No description
 * @property profile No description
 */
data class Hint(
    val type: HintType,
    val section: HintSection,
    val description: String,
    val global: BoolInt? = null,
    val group: Group? = null,
    val profile: UserMin? = null
)
