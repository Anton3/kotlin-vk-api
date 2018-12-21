package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.generated.groups.objects.GroupsArray

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
