@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.GetCallbackConfirmationCodeResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getCallbackConfirmationCode]
 *
 * Returns Callback API confirmation code for the community.
 *
 * @property groupId Community ID.
 */
data class GroupsGetCallbackConfirmationCode(
    var groupId: Long
) : VkMethod<GetCallbackConfirmationCodeResponse>(
    "groups.getCallbackConfirmationCode",
    jacksonTypeRef()
), UserGroupMethod
