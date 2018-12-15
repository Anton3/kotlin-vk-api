@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.removeOfficeUsers]
 *
 * Removes managers and/or supervisors from advertising account.
 *
 * @property accountId Advertising account ID.
 * @property ids Serialized JSON array with IDs of deleted managers.
 */
data class AdsRemoveOfficeUsers(
    var accountId: Long,
    var ids: String
) : VkMethod<Boolean>("ads.removeOfficeUsers", jacksonTypeRef()),
    UserMethod
