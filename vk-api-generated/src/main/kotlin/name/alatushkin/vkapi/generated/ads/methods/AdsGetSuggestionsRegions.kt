@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.ads.objects.TargSuggestionsRegions
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 * @property country ID of the country objects are searched in.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
data class AdsGetSuggestionsRegions(
    var q: String? = null,
    var country: Long? = null
) : VkMethod<List<TargSuggestionsRegions>>("ads.getSuggestions", jacksonTypeRef()),
    UserMethod {
    init {
        unsafeParam("section", "regions")
    }
}
