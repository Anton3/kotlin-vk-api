@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property member Information whether user is a member of the group
 * @property invitation Information whether user has been invited to the group
 * @property canInvite Information whether user can be invited
 * @property canRecall Information whether user's invite to the group can be recalled
 * @property request Information whether user has sent request to the group
 */
data class IsMemberExtendedResponse(
    val member: BoolInt,
    val invitation: BoolInt? = null,
    val canInvite: BoolInt? = null,
    val canRecall: BoolInt? = null,
    val request: BoolInt? = null
)
