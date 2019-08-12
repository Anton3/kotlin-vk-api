@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.addGroup]
 *
 * Adds a community to user faves.
 *
 * @property groupId Community ID.
 */
data class FaveAddGroup(
    var groupId: Int
) : VkMethod<OkResponse, UserMethod>("fave.addGroup", jacksonTypeRef())
