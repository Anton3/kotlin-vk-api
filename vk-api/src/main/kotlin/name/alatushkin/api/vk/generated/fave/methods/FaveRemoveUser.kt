@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.removeUser]
 *
 * Removes a profile from user faves.
 *
 * @property userId Profile ID.
 */
data class FaveRemoveUser(
    var userId: Long
) : VkMethod<OkResponse>(
    "fave.removeUser",
    jacksonTypeRef()
), UserMethod
