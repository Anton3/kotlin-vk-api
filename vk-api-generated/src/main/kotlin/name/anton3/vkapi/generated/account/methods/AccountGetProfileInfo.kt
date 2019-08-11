@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.account.objects.UserSettings
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/account.getProfileInfo]
 *
 * Returns the current account info.
 *

 */
class AccountGetProfileInfo : CheckedMethod<UserSettings, UserMethod>("account.getProfileInfo", jacksonTypeRef())
