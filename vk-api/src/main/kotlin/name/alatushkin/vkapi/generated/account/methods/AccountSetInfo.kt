@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setInfo]
 *
 * Allows to edit the current account info.
 *
 * @property name Setting name.
 * @property value Setting value.
 */
data class AccountSetInfo(
    var name: String? = null,
    var value: String? = null
) : VkMethod<OkResponse>(
    "account.setInfo",
    jacksonTypeRef()
), UserMethod
