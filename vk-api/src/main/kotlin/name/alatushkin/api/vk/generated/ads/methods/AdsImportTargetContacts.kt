@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.importTargetContacts]
 *
 * Imports a list of advertiser's contacts to count VK registered users against the target group.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 * @property targetGroupId Target group ID.
 * @property contacts List of phone numbers, emails or user IDs separated with a comma.
 */
data class AdsImportTargetContacts(
    var accountId: Long,
    var clientId: Long? = null,
    var targetGroupId: Long,
    var contacts: String
) : VkMethod<Long>(
    "ads.importTargetContacts",
    jacksonTypeRef()
), UserMethod
