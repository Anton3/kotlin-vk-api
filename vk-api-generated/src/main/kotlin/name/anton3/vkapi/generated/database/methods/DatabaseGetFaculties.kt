@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.database.objects.Faculty
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

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
    var universityId: Int,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<Faculty>, UserServiceMethod>("database.getFaculties", jacksonTypeRef())
