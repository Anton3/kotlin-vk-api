@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
