@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/database.getCitiesById]
 *
 * Returns information about cities by their IDs.
 *
 * @property cityIds City IDs.
 */
data class DatabaseGetCitiesById(
    var cityIds: List<Int>? = null
) : VkMethod<List<Object>, UserServiceMethod>("database.getCitiesById", jacksonTypeRef())
