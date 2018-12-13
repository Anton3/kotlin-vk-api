@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
