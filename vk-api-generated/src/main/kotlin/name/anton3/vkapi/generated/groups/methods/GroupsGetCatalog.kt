@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getCatalog]
 *
 * Returns communities list for a catalog category.
 *
 * @property categoryId Category id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 * @property subcategoryId Subcategory id received from [vk.com/dev/groups.getCatalogInfo|groups.getCatalogInfo].
 */
data class GroupsGetCatalog(
    var categoryId: Int? = null,
    var subcategoryId: Int? = null
) : CheckedMethod<VkList<Group>, UserMethod>("groups.getCatalog", jacksonTypeRef())
