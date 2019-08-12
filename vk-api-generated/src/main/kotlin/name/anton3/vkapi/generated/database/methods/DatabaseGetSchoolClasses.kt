@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/database.getSchoolClasses]
 *
 * Returns a list of school classes specified for the country.
 *
 * @property countryId Country ID.
 */
data class DatabaseGetSchoolClasses(
    var countryId: Int? = null
) : VkMethod<List<List<String>>, UserServiceMethod>("database.getSchoolClasses", jacksonTypeRef())
