@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.ServiceMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/secure.setUserLevel]
 *
 * Sets user game level in the application which can be seen by his/her friends.
 *
 * @property levels No description
 * @property userId No description
 * @property level level value.
 */
data class SecureSetUserLevel(
    var levels: List<String>? = null,
    var userId: Long? = null,
    var level: Long? = null
) : VkMethod<OkResponse>("secure.setUserLevel", jacksonTypeRef()),
    ServiceMethod
