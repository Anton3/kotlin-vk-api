package name.alatushkin.vkapi.generated.users.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupsArray

/**
 * No description
 *
 * @property users No description
 * @property groups No description
 */
data class GetSubscriptionsResponse(
    val users: UsersArray,
    val groups: GroupsArray
)
