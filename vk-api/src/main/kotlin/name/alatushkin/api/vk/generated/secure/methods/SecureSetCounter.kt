@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.setCounter]
 *
 * Sets a counter which is shown to the user in bold in the left menu.
 *
 * @property counters 
 * @property userId 
 * @property counter counter value.
 */
data class SecureSetCounter(
    var counters: List<String>? = null,
    var userId: Long? = null,
    var counter: Long? = null
) : VkMethod<OkResponse>(
    "secure.setCounter",
    jacksonTypeRef()
), ServiceMethod
