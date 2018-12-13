@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
