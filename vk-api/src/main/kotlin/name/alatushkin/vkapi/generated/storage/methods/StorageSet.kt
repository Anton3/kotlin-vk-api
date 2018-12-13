@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/storage.set]
 *
 * Saves a value of variable with the name set by 'key' parameter.
 *
 * @property key 
 * @property value 
 * @property userId 
 */
data class StorageSet(
    var key: String,
    var value: String? = null,
    var userId: Long? = null
) : VkMethod<OkResponse>(
    "storage.set",
    jacksonTypeRef()
), UserMethod
