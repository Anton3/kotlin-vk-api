@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.AddCallbackServerResponse
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.addCallbackServer]
 *
 * No description
 *
 * @property groupId No description
 * @property url No description
 * @property title No description
 * @property secretKey No description
 */
data class GroupsAddCallbackServer(
    var groupId: Int,
    var url: String,
    var title: String,
    var secretKey: String? = null
) : VkMethod<AddCallbackServerResponse, UserGroupMethod>("groups.addCallbackServer", jacksonTypeRef())
