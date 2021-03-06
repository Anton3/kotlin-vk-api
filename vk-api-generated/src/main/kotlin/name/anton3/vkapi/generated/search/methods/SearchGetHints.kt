@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.search.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.search.objects.GetHintsResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/search.getHints]
 *
 * Allows the programmer to do a quick search for any substring.
 *
 * @property q Search query string.
 * @property offset Offset for querying specific result subset
 * @property limit Maximum number of results to return.
 * @property filters No description
 * @property fields No description
 * @property searchGlobal No description
 */
data class SearchGetHints(
    var q: String? = null,
    var offset: Int? = null,
    var limit: Int? = null,
    var filters: List<String>? = null,
    var fields: List<String>? = null,
    var searchGlobal: Boolean? = null
) : VkMethod<GetHintsResponse, UserMethod>("search.getHints", jacksonTypeRef())
