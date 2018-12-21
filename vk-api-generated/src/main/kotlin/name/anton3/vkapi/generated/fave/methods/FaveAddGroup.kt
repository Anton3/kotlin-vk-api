@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.addGroup]
 *
 * Adds a community to user faves.
 *
 * @property groupId Community ID.
 */
data class FaveAddGroup(
    var groupId: Long
) : VkMethod<OkResponse>("fave.addGroup", jacksonTypeRef()),
    UserMethod
