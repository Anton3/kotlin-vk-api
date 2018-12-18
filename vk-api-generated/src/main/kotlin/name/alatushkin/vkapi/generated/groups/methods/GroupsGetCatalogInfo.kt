@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.GetCatalogInfoResponse
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.getCatalogInfo]
 *
 * Returns categories list for communities catalog
 *
 * @property subcategories 1 – to return subcategories info. By default: 0.
 */
data class GroupsGetCatalogInfo(
    var subcategories: Boolean? = null
) : VkMethod<GetCatalogInfoResponse>("groups.getCatalogInfo", jacksonTypeRef()),
    UserMethod
