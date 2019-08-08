@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod

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
    var userId: Int? = null
) : VkMethod<String>("storage.get", jacksonTypeRef()),
    UserMethod
