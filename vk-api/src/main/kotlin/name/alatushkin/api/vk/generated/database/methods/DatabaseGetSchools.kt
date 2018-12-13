@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.database.objects.School
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var cityId: Long,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<School>>(
    "database.getSchools",
    jacksonTypeRef()
), UserServiceMethod
