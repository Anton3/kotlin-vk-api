@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/storage.get]
 *
 * Returns a value of variable with the name set by key parameter.
 *
 * @property key No description
 * @property userId No description
 * @property global No description
 */
data class StorageGetKey(
    var key: String? = null,
    var userId: Int? = null,
    var global: Boolean? = null
) : VkMethod<String, UserMethod>("storage.get", jacksonTypeRef())
