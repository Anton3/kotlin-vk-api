@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.TargSuggestions
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
data class AdsGetSuggestionsCountries(
    var q: String? = null
) : VkMethod<List<TargSuggestions>, UserMethod>("ads.getSuggestions", jacksonTypeRef()) {
    init {
        unsafeParam("section", "countries")
    }
}
