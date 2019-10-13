@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.database.objects.Station
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/database.getMetroStationsById]
 *
 * Get metro station by his id
 *
 * @property stationIds No description
 */
data class DatabaseGetMetroStationsById(
    var stationIds: List<Int>? = null
) : VkMethod<List<Station>, UserServiceMethod>("database.getMetroStationsById", jacksonTypeRef())
