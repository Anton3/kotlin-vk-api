@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCountriesById]
 *
 * Returns information about countries by their IDs.
 *
 * @property countryIds Country IDs.
 */
data class DatabaseGetCountriesById(
    var countryIds: List<Long>? = null
) : VkMethod<List<Country>>("database.getCountriesById", jacksonTypeRef()),
    UserServiceMethod