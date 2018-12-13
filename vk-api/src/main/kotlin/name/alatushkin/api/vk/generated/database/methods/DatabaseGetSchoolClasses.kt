@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/database.getSchoolClasses]
 *
 * Returns a list of school classes specified for the country.
 *
 * @property countryId Country ID.
 */
data class DatabaseGetSchoolClasses(
    var countryId: Long? = null
) : VkMethod<List<List<String>>>(
    "database.getSchoolClasses",
    jacksonTypeRef()
), UserServiceMethod
