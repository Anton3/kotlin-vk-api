@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/ads.updateTargetGroup]
 *
 * Edits a retarget group.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 * @property targetGroupId Group ID.
 * @property name New name of the target group — a string up to 64 characters long.
 * @property domain Domain of the site where user accounting code will be placed.
 * @property lifetime 'Only for the groups that get audience from sites with user accounting code.', Time in days when users added to a retarget group will be automatically excluded from it. '0' – automatic exclusion is off.
 */
data class AdsUpdateTargetGroup(
    var accountId: Long,
    var clientId: Long? = null,
    var targetGroupId: Long,
    var name: String,
    var domain: String? = null,
    var lifetime: Long? = null
) : VkMethod<OkResponse>("ads.updateTargetGroup", jacksonTypeRef()),
    UserMethod
