@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.database.objects.University
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/database.getUniversities]
 *
 * Returns a list of higher education institutions.
 *
 * @property q Search query.
 * @property countryId Country ID.
 * @property cityId City ID.
 * @property offset Offset needed to return a specific subset of universities.
 * @property count Number of universities to return.
 */
data class DatabaseGetUniversities(
    var q: String? = null,
    var countryId: Int? = null,
    var cityId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null
) : CheckedMethod<VkList<University>, UserServiceMethod>("database.getUniversities", jacksonTypeRef())
