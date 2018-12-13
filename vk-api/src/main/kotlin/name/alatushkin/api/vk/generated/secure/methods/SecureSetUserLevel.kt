@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.setUserLevel]
 *
 * Sets user game level in the application which can be seen by his/her friends.
 *
 * @property levels 
 * @property userId 
 * @property level level value.
 */
data class SecureSetUserLevel(
    var levels: List<String>? = null,
    var userId: Long? = null,
    var level: Long? = null
) : VkMethod<OkResponse>(
    "secure.setUserLevel",
    jacksonTypeRef()
), ServiceMethod
