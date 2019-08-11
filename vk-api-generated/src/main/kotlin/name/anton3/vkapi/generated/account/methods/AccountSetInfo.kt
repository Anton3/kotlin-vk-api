@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
) : CheckedMethod<OkResponse, UserMethod>("account.setInfo", jacksonTypeRef())
