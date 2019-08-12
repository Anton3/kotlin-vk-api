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
 * @property ids Objects IDs separated by commas. If the parameter is passed, 'q, country, cities' should not be passed.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
data class AdsGetSuggestionsDecodeDistricts(
    var ids: String? = null
) : VkMethod<List<TargSuggestionsCities>, UserMethod>("ads.getSuggestions", jacksonTypeRef()) {
    init {
        unsafeParam("section", "districts")
    }
}
