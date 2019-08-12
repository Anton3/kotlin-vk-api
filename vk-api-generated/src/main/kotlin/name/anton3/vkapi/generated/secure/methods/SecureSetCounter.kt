@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.method.VkMethod
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
    var userId: Int? = null,
    var counter: Int? = null
) : VkMethod<OkResponse, ServiceMethod>("secure.setCounter", jacksonTypeRef())
