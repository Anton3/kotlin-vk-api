@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.database.objects.City
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/database.getCities]
 *
 * Returns a list of cities.
 *
 * @property countryId Country ID.
 * @property regionId Region ID.
 * @property q Search query.
 * @property needAll '1' — to return all cities in the country, '0' — to return major cities in the country (default),
 * @property offset Offset needed to return a specific subset of cities.
 * @property count Number of cities to return.
 */
data class DatabaseGetCities(
    var countryId: Long,
    var regionId: Long? = null,
    var q: String? = null,
    var needAll: Boolean? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<City>>(
    "database.getCities",
    jacksonTypeRef()
), UserServiceMethod
