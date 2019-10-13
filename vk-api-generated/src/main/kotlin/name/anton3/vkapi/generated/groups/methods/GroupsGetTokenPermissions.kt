@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.GetTokenPermissionsResponse
import name.anton3.vkapi.method.GroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.getTokenPermissions]
 *
 * No description
 *

 */
class GroupsGetTokenPermissions : VkMethod<GetTokenPermissionsResponse, GroupMethod>("groups.getTokenPermissions", jacksonTypeRef())
