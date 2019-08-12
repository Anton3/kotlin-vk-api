@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.setOffline]
 *
 * Marks a current user as offline.
 *

 */
class AccountSetOffline : VkMethod<OkResponse, UserMethod>("account.setOffline", jacksonTypeRef())
