@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.search.objects

import name.anton3.vkapi.generated.apps.objects.App
import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property app No description
 * @property description Object description
 * @property global No description
 * @property group No description
 * @property profile No description
 * @property section No description
 * @property type No description
 */
data class Hint(
    val app: App? = null,
    val description: String,
    val global: BoolInt? = null,
    val group: Group? = null,
    val profile: UserMin? = null,
    val section: HintSection,
    val type: HintType
)
