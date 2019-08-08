@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.ads.objects.Client
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.getClients]
 *
 * Returns a list of advertising agency's clients.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetClients(
    var accountId: Int
) : VkMethod<List<Client>>("ads.getClients", jacksonTypeRef()),
    UserMethod
