@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.database.objects.Station
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/database.getMetroStations]
 *
 * Get metro stations by city
 *
 * @property cityId No description
 * @property offset No description
 * @property count No description
 * @property extended No description
 */
data class DatabaseGetMetroStations(
    var cityId: Int,
    var offset: Int? = null,
    var count: Int? = null,
    var extended: Boolean? = null
) : VkMethod<VkList<Station>, UserServiceMethod>("database.getMetroStations", jacksonTypeRef())
