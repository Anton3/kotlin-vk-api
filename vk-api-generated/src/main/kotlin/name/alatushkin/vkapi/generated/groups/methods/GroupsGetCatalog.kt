@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.tokens.UserMethod
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
    var categoryId: Long? = null,
    var subcategoryId: Long? = null
) : VkMethod<VkList<Group>>("groups.getCatalog", jacksonTypeRef()),
    UserMethod
