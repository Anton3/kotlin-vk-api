@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.ban]
 *
 * No description
 *
 * @property ownerId No description
 */
data class AccountBan(
    var ownerId: Int? = null
) : VkMethod<OkResponse, UserMethod>("account.ban", jacksonTypeRef())
