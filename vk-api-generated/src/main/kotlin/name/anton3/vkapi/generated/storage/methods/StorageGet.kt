@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/storage.get]
 *
 * Returns a value of variable with the name set by key parameter.
 *
 * @property key No description
 * @property keys No description
 * @property userId No description
 */
data class StorageGet(
    var key: String? = null,
    var keys: List<String>? = null,
    var userId: Long? = null
) : VkMethod<String>("storage.get", jacksonTypeRef()),
    UserMethod
