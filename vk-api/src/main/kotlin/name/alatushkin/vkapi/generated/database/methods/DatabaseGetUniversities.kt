@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.database.objects.University
import name.alatushkin.vkapi.tokens.UserServiceMethod
import name.alatushkin.vkapi.vktypes.VkList

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
