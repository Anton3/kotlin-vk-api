@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property member No description
 * @property invitation No description
 * @property canInvite No description
 * @property canRecall No description
 * @property request No description
 */
data class IsMemberExtendedResponse(
    val member: BoolInt,
    val invitation: BoolInt? = null,
    val canInvite: BoolInt? = null,
    val canRecall: BoolInt? = null,
    val request: BoolInt? = null
)
