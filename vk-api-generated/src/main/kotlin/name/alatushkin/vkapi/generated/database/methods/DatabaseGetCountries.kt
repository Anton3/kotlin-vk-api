@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.tokens.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/database.getCountries]
 *
 * Returns a list of countries.
 *
 * @property needAll '1' — to return a full list of all countries, '0' — to return a list of countries near the current user's country (default).
 * @property code Country codes in [vk.com/dev/country_codes|ISO 3166-1 alpha-2] standard.
 * @property offset Offset needed to return a specific subset of countries.
 * @property count Number of countries to return.
 */
data class DatabaseGetCountries(
    var needAll: Boolean? = null,
    var code: String? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Country>>("database.getCountries", jacksonTypeRef()),
    UserServiceMethod
