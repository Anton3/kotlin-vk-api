@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.search.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.search.objects.GetHintsResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/search.getHints]
 *
 * Allows the programmer to do a quick search for any substring.
 *
 * @property q Search query string.
 * @property offset Offset for querying specific result subset
 * @property limit Maximum number of results to return.
 * @property filters 
 * @property searchGlobal 
 */
data class SearchGetHints(
    var q: String? = null,
    var offset: Long? = null,
    var limit: Long? = null,
    var filters: List<String>? = null,
    var searchGlobal: Boolean? = null
) : VkMethod<GetHintsResponse>("search.getHints", jacksonTypeRef()),
    UserMethod
