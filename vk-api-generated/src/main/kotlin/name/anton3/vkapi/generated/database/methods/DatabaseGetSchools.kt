@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.database.objects.School
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/database.getSchools]
 *
 * Returns a list of schools.
 *
 * @property q Search query.
 * @property cityId City ID.
 * @property offset Offset needed to return a specific subset of schools.
 * @property count Number of schools to return.
 */
data class DatabaseGetSchools(
    var q: String? = null,
    var cityId: Int,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<School>, UserServiceMethod>("database.getSchools", jacksonTypeRef())
