@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.addGroup]
 *
 * Adds a community to user faves.
 *
 * @property groupId Community ID.
 */
data class FaveAddGroup(
    var groupId: Long
) : VkMethod<OkResponse>(
    "fave.addGroup",
    jacksonTypeRef()
), UserMethod
