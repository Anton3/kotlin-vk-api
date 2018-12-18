@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.ads.objects.Client
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getClients]
 *
 * Returns a list of advertising agency's clients.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetClients(
    var accountId: Long
) : VkMethod<List<Client>>("ads.getClients", jacksonTypeRef()),
    UserMethod
