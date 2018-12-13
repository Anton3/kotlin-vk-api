@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.TargSuggestionsSchools
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getSuggestions]
 *
 * Returns a set of auto-suggestions for various targeting parameters.
 *
 * @property q Filter-line of the request (for countries, regions, cities, streets, schools, interests, positions).
 * @property cities IDs of cities where objects are searched in, separated with a comma.
 * @property lang Language of the returned string values. Supported languages: *ru — Russian,, *ua — Ukrainian,, *en — English.
 */
data class AdsGetSuggestionsSchools(
    var q: String? = null,
    var cities: String? = null
) : VkMethod<List<TargSuggestionsSchools>>(
    "ads.getSuggestions",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("section", "schools")
    }
}
