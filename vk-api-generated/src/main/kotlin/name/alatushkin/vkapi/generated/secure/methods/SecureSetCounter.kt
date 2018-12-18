@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.ServiceMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/secure.setCounter]
 *
 * Sets a counter which is shown to the user in bold in the left menu.
 *
 * @property counters No description
 * @property userId No description
 * @property counter counter value.
 */
data class SecureSetCounter(
    var counters: List<String>? = null,
    var userId: Long? = null,
    var counter: Long? = null
) : VkMethod<OkResponse>("secure.setCounter", jacksonTypeRef()),
    ServiceMethod
