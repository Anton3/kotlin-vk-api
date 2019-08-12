@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
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
    var userId: Int? = null
) : VkMethod<OkResponse, UserMethod>("storage.set", jacksonTypeRef())
