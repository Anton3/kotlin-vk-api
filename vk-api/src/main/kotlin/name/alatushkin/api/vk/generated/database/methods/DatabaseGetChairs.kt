@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.database.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.Object
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var facultyId: Long,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Object>>(
    "database.getChairs",
    jacksonTypeRef()
), UserServiceMethod
