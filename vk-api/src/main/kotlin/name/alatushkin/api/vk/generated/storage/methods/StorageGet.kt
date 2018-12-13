@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/storage.get]
 *
 * Returns a value of variable with the name set by key parameter.
 *
 * @property key 
 * @property keys 
 * @property userId 
 */
data class StorageGet(
    var key: String? = null,
    var keys: List<String>? = null,
    var userId: Long? = null
) : VkMethod<String>(
    "storage.get",
    jacksonTypeRef()
), UserMethod
