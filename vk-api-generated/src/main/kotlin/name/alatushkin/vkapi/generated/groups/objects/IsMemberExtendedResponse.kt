package name.alatushkin.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property member Information whether user is a member of the group
 * @property invitation Information whether user has been invited to the group
 * @property request Information whether user has sent request to the group
 */
data class IsMemberExtendedResponse(
    val member: Boolean,
    val invitation: Boolean? = null,
    val request: Boolean? = null
)
