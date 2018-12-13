@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.database.objects.University
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var countryId: Long? = null,
    var cityId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<University>>(
    "database.getUniversities",
    jacksonTypeRef()
), UserServiceMethod
