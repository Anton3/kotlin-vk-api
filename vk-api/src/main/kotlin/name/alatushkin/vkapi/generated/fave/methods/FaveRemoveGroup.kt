@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.removeGroup]
 *
 * Removes a community from user faves.
 *
 * @property groupId Community ID.
 */
data class FaveRemoveGroup(
    var groupId: Long
) : VkMethod<OkResponse>(
    "fave.removeGroup",
    jacksonTypeRef()
), UserMethod
