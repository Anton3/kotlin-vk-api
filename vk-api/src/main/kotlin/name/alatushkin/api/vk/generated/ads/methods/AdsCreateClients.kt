@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createClients]
 *
 * Creates clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe created campaigns. Description of 'client_specification' objects see below.
 */
data class AdsCreateClients(
    var accountId: Long,
    var data: String
) : VkMethod<List<Long>>(
    "ads.createClients",
    jacksonTypeRef()
), UserMethod
