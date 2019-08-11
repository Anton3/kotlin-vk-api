@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.TargSuggestions
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property ids Objects IDs separated by commas. If the parameter is passed, 'q, country, cities' should not be passed.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
data class AdsGetSuggestionsDecodeInterestCategories(
    var ids: String? = null
) : CheckedMethod<List<TargSuggestions>, UserMethod>("ads.getSuggestions", jacksonTypeRef()) {
    init {
        unsafeParam("section", "interest_categories")
    }
}
