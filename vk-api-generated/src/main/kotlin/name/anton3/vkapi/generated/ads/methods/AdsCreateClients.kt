@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createClients]
 *
 * Creates clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created campaigns. Description of 'client_specification' objects see below.
 */
data class AdsCreateClients(
    var accountId: Int,
    var data: String
) : VkMethod<List<Int>>("ads.createClients", jacksonTypeRef()),
    UserMethod
