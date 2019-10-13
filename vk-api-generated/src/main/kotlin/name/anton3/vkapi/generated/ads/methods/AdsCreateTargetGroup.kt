@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.CreateTargetGroupResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.createTargetGroup]
 *
 * Creates a group to re-target ads for users who visited advertiser's site (viewed information about the product, registered, etc.).
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
 * @property name Name of the target group — a string up to 64 characters long.
 * @property lifetime 'For groups with auditory created with pixel code only.', , Number of days after that users will be automatically removed from the group.
 * @property targetPixelId No description
 * @property targetPixelRules No description
 */
data class AdsCreateTargetGroup(
    var accountId: Int,
    var clientId: Int? = null,
    var name: String,
    var lifetime: Int? = null,
    var targetPixelId: Int? = null,
    var targetPixelRules: String? = null
) : VkMethod<CreateTargetGroupResponse, UserMethod>("ads.createTargetGroup", jacksonTypeRef())
