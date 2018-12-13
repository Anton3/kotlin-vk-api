@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.ads.objects.CreateTargetGroupResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.createTargetGroup]
 *
 * Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
 * @property name Name of the target group — a string up to 64 characters long.
 * @property domain Domain of the site where user accounting code will be placed.
 * @property lifetime 'For groups with auditory created with pixel code only.', , Number of days after that users will be automatically removed from the group. '0' — not to remove users.
 */
data class AdsCreateTargetGroup(
    var accountId: Long,
    var clientId: Long? = null,
    var name: String,
    var domain: String? = null,
    var lifetime: Long? = null
) : VkMethod<CreateTargetGroupResponse>(
    "ads.createTargetGroup",
    jacksonTypeRef()
), UserMethod
