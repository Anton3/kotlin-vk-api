@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.Country
import name.alatushkin.vkapi.tokens.UserServiceMethod

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
