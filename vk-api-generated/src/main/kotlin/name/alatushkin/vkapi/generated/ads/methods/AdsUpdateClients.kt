@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.updateClients]
 *
 * Edits clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe changes in clients. Description of 'client_mod' objects see below.
 */
data class AdsUpdateClients(
    var accountId: Long,
    var data: String
) : VkMethod<Long>("ads.updateClients", jacksonTypeRef()),
    UserMethod
