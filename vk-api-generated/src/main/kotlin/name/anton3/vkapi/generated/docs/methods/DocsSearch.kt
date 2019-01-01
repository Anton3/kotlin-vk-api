@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/docs.search]
 *
 * Returns a list of documents matching the search criteria.
 *
 * @property q Search query string.
 * @property searchOwn No description
 * @property count Number of results to return.
 * @property offset Offset needed to return a specific subset of results.
 */
data class DocsSearch(
    var q: String,
    var searchOwn: Boolean? = null,
    var count: Int? = null,
    var offset: Int? = null
) : VkMethod<VkList<Doc>>("docs.search", jacksonTypeRef()),
    UserGroupMethod
