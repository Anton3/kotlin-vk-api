@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/database.getChairs]
 *
 * Returns list of chairs on a specified faculty.
 *
 * @property facultyId id of the faculty to get chairs from
 * @property offset offset required to get a certain subset of chairs
 * @property count amount of chairs to get
 */
data class DatabaseGetChairs(
    var facultyId: Int,
    var offset: Int? = null,
    var count: Int? = null
) : CheckedMethod<VkList<Object>, UserServiceMethod>("database.getChairs", jacksonTypeRef())
