@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.addresses.objects.Fields
import name.anton3.vkapi.generated.groups.objects.Address
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getAddresses]
 *
 * Returns a list of community addresses.
 *
 * @property groupId ID or screen name of the community.
 * @property addressIds No description
 * @property latitude Latitude of  the user geo position.
 * @property longitude Longitude of the user geo position.
 * @property offset Offset needed to return a specific subset of community addresses.
 * @property count Number of community addresses to return.
 * @property fields Address fields
 */
data class GroupsGetAddresses(
    var groupId: Int,
    var addressIds: List<Int>? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var fields: List<Fields>? = null
) : VkMethod<VkList<Address>, UserServiceMethod>("groups.getAddresses", jacksonTypeRef())
