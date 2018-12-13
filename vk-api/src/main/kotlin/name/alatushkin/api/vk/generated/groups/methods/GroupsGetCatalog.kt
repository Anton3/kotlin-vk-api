@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getCatalog]
 *
 * Returns communities list for a catalog category.
 *
 * @property categoryId Category id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 * @property subcategoryId Subcategory id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 */
data class GroupsGetCatalog(
    var categoryId: Long? = null,
    var subcategoryId: Long? = null
) : VkMethod<VkList<Group>>(
    "groups.getCatalog",
    jacksonTypeRef()
), UserMethod
