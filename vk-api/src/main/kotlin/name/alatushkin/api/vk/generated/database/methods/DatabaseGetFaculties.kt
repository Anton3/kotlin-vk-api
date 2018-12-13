@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.database.objects.Faculty
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/database.getFaculties]
 *
 * Returns a list of faculties (i.e., university departments).
 *
 * @property universityId University ID.
 * @property offset Offset needed to return a specific subset of faculties.
 * @property count Number of faculties to return.
 */
data class DatabaseGetFaculties(
    var universityId: Long,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Faculty>>(
    "database.getFaculties",
    jacksonTypeRef()
), UserServiceMethod
