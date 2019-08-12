@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.GetCatalogInfoExtendedResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.getCatalogInfo]
 *
 * Returns categories list for communities catalog
 *
 * @property subcategories 1 – to return subcategories info. By default: 0.
 */
data class GroupsGetCatalogInfoExtended(
    var subcategories: Boolean? = null
) : VkMethod<GetCatalogInfoExtendedResponse, UserMethod>("groups.getCatalogInfo", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
