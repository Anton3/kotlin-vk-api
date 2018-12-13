@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.account.objects.UserSettings
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getProfileInfo]
 *
 * Returns the current account info.
 *

 */
class AccountGetProfileInfo : VkMethod<UserSettings>(
    "account.getProfileInfo",
    jacksonTypeRef()
), UserMethod
