@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.GetCallbackConfirmationCodeResponse
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.getCallbackConfirmationCode]
 *
 * Returns Callback API confirmation code for the community.
 *
 * @property groupId Community ID.
 */
data class GroupsGetCallbackConfirmationCode(
    var groupId: Int
) : VkMethod<GetCallbackConfirmationCodeResponse, UserGroupMethod>("groups.getCallbackConfirmationCode", jacksonTypeRef())
