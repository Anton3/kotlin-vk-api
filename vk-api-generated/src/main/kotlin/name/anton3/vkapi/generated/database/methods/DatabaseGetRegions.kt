@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.database.objects.Region
import name.anton3.vkapi.tokens.UserServiceMethod
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
    var countryId: Long,
    var q: String? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Region>>("database.getRegions", jacksonTypeRef()),
    UserServiceMethod