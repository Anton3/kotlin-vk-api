@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.ServiceMethod
import name.anton3.vkapi.vktypes.OkResponse

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