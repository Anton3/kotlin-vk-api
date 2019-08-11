@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCountriesById]
 *
 * Returns information about countries by their IDs.
 *
 * @property countryIds Country IDs.
 */
data class DatabaseGetCountriesById(
    var countryIds: List<Int>? = null
) : CheckedMethod<List<Country>, UserServiceMethod>("database.getCountriesById", jacksonTypeRef())
