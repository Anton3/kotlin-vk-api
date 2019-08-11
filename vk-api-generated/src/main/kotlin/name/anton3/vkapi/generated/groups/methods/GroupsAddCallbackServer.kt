@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.AddCallbackServerResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.MethodRequirement

/**
 * [https://vk.com/dev/groups.addCallbackServer]
 *
 * No description
 *
 * @property groupId Community ID.
 * @property url Server URL.
 * @property title Title
 * @property secretKey Secret key
 */
data class GroupsAddCallbackServer(
    var groupId: Int,
    var url: String? = null,
    var title: String? = null,
    var secretKey: String? = null
) : CheckedMethod<AddCallbackServerResponse, MethodRequirement>("groups.addCallbackServer", jacksonTypeRef())
