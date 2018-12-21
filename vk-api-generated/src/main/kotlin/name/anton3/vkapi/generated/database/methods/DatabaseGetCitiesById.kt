@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCitiesById]
 *
 * Returns information about cities by their IDs.
 *
 * @property cityIds City IDs.
 */
data class DatabaseGetCitiesById(
    var cityIds: List<Long>? = null
) : VkMethod<List<Object>>("database.getCitiesById", jacksonTypeRef()),
    UserServiceMethod
