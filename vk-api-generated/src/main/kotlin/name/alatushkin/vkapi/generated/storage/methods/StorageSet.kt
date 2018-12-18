@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/storage.set]
 *
 * Saves a value of variable with the name set by 'key' parameter.
 *
 * @property key No description
 * @property value No description
 * @property userId No description
 */
data class StorageSet(
    var key: String,
    var value: String? = null,
    var userId: Long? = null
) : VkMethod<OkResponse>("storage.set", jacksonTypeRef()),
    UserMethod
