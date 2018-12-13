@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.groups.objects.AddCallbackServerResponse

/**
 * [https://vk.com/dev/groups.addCallbackServer]
 *
 * null
 *
 * @property groupId Community ID.
 * @property url Server URL.
 * @property title Title
 * @property secretKey Secret key
 */
data class GroupsAddCallbackServer(
    var groupId: Long,
    var url: String? = null,
    var title: String? = null,
    var secretKey: String? = null
) : VkMethod<AddCallbackServerResponse>(
    "groups.addCallbackServer",
    jacksonTypeRef()
)
