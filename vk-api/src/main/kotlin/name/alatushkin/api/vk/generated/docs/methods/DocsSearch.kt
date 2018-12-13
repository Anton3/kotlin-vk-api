@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.docs.objects.Doc
import name.alatushkin.api.vk.tokens.UserGroupMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/docs.search]
 *
 * Returns a list of documents matching the search criteria.
 *
 * @property q Search query string.
 * @property searchOwn 
 * @property count Number of results to return.
 * @property offset Offset needed to return a specific subset of results.
 */
data class DocsSearch(
    var q: String,
    var searchOwn: Boolean? = null,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<Doc>>(
    "docs.search",
    jacksonTypeRef()
), UserGroupMethod
