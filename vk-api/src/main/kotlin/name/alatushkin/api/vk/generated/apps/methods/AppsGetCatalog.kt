@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.apps.objects.App
import name.alatushkin.api.vk.generated.apps.objects.GetCatalogSort
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/apps.getCatalog]
 *
 * Returns a list of applications (apps) available to users in the App Catalog.
 *
 * @property sort Sort order: 'popular_today' — popular for one day (default), 'visitors' — by visitors number , 'create_date' — by creation date, 'growth_rate' — by growth rate, 'popular_week' — popular for one week
 * @property offset Offset required to return a specific subset of apps.
 * @property count Number of apps to return.
 * @property platform 
 * @property extended '1' — to return additional fields 'screenshots', 'MAU', 'catalog_position', and 'international'. If set, 'count' must be less than or equal to '100'. '0' — not to return additional fields (default).
 * @property returnFriends 
 * @property fields 
 * @property nameCase 
 * @property q Search query string.
 * @property genreId 
 * @property filter 'installed' — to return list of installed apps (only for mobile platform).
 */
data class AppsGetCatalog(
    var sort: GetCatalogSort? = null,
    var offset: Long? = null,
    var count: Long,
    var platform: String? = null,
    var extended: Boolean? = null,
    var returnFriends: Boolean? = null,
    var fields: List<String>? = null,
    var nameCase: String? = null,
    var q: String? = null,
    var genreId: Long? = null,
    var filter: String? = null
) : VkMethod<VkList<App>>(
    "apps.getCatalog",
    jacksonTypeRef()
), UserServiceMethod
