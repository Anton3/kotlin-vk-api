@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteClients]
 *
 * Archives clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with IDs of deleted clients.
 */
data class AdsDeleteClients(
    var accountId: Long,
    var ids: String
) : VkMethod<Long>(
    "ads.deleteClients",
    jacksonTypeRef()
), UserMethod
