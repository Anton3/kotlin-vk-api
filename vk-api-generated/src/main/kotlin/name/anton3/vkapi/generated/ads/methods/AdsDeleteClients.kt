@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.deleteClients]
 *
 * Archives clients of an advertising agency.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with IDs of deleted clients.
 */
data class AdsDeleteClients(
    var accountId: Int,
    var ids: String
) : CheckedMethod<Int, UserMethod>("ads.deleteClients", jacksonTypeRef())
