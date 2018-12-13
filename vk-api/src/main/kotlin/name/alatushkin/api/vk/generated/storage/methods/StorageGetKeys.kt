@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/storage.getKeys]
 *
 * Returns the names of all variables.
 *
 * @property userId user id, whose variables names are returned if they were requested with a server method.
 * @property count amount of variable names the info needs to be collected from.
 */
data class StorageGetKeys(
    var userId: Long? = null,
    var count: Long? = null
) : VkMethod<List<String>>(
    "storage.getKeys",
    jacksonTypeRef()
), UserMethod
