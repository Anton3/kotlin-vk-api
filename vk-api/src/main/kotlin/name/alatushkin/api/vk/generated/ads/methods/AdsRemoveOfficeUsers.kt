@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<Boolean>(
    "ads.removeOfficeUsers",
    jacksonTypeRef()
), UserMethod
