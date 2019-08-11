@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.storage.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/storage.getKeys]
 *
 * Returns the names of all variables.
 *
 * @property userId user id, whose variables names are returned if they were requested with a server method.
 * @property count amount of variable names the info needs to be collected from.
 */
data class StorageGetKeys(
    var userId: Int? = null,
    var count: Int? = null
) : CheckedMethod<List<String>, UserMethod>("storage.getKeys", jacksonTypeRef())
