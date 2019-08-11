@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.database.objects.Region
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/database.getRegions]
 *
 * Returns a list of regions.
 *
 * @property countryId Country ID, received in [vk.com/dev/database.getCountries|database.getCountries] method.
 * @property q Search query.
 * @property offset Offset needed to return specific subset of regions.
 * @property count Number of regions to return.
 */
data class DatabaseGetRegions(
    var countryId: Int,
    var q: String? = null,
    var offset: Int? = null,
    var count: Int? = null
) : CheckedMethod<VkList<Region>, UserServiceMethod>("database.getRegions", jacksonTypeRef())
