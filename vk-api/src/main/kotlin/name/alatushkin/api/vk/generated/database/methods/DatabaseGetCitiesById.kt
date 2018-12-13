@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.Object
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getCitiesById]
 *
 * Returns information about cities by their IDs.
 *
 * @property cityIds City IDs.
 */
data class DatabaseGetCitiesById(
    var cityIds: List<Long>? = null
) : VkMethod<List<Object>>(
    "database.getCitiesById",
    jacksonTypeRef()
), UserServiceMethod
