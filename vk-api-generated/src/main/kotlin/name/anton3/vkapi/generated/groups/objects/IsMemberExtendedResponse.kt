package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property member Information whether user is a member of the group
 * @property invitation Information whether user has been invited to the group
 * @property request Information whether user has sent request to the group
 */
data class IsMemberExtendedResponse(
    val member: BoolInt,
    val invitation: BoolInt? = null,
    val request: BoolInt? = null
)
