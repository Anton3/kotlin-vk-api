@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setNameInMenu]
 *
 * Sets an application screen name (up to 17 characters), that is shown to the user in the left menu.
 *
 * @property userId User ID.
 * @property name Application screen name.
 */
data class AccountSetNameInMenu(
    var userId: Long,
    var name: String? = null
) : VkMethod<OkResponse>(
    "account.setNameInMenu",
    jacksonTypeRef()
), UserMethod
