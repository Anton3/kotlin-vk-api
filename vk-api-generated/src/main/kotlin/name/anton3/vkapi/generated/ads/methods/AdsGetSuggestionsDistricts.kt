@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.TargSuggestionsCities
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 * @property cities IDs of cities where objects are searched in, separated with a comma.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
data class AdsGetSuggestionsDistricts(
    var q: String? = null,
    var cities: String? = null
) : VkMethod<List<TargSuggestionsCities>, UserMethod>("ads.getSuggestions", jacksonTypeRef()) {
    init {
        unsafeParam("section", "districts")
    }
}
