@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.storage.objects.Value
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/storage.get]
 *
 * Returns a value of variable with the name set by key parameter.
 *
 * @property keys No description
 * @property userId No description
 * @property global No description
 */
data class StorageGetkeys(
    var keys: List<String>? = null,
    var userId: Int? = null,
    var global: Boolean? = null
) : VkMethod<List<Value>, UserMethod>("storage.get", jacksonTypeRef())
