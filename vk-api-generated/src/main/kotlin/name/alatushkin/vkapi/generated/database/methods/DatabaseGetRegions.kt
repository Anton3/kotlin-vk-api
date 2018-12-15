@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.database.objects.Region
import name.alatushkin.vkapi.tokens.UserServiceMethod
import name.alatushkin.vkapi.vktypes.VkList

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
