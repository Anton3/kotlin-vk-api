@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/account.setOffline]
 *
 * Marks a current user as offline.
 *

 */
class AccountSetOffline : VkMethod<OkResponse>(
    "account.setOffline",
    jacksonTypeRef()
), UserMethod
