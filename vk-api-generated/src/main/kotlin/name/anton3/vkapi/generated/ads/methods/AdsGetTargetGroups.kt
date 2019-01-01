@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.ads.objects.TargetGroup
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getTargetGroups]
 *
 * Returns a list of target groups.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.', ID of the client with the advertising account where the group will be created.
 * @property extended '1' — to return pixel code.
 */
data class AdsGetTargetGroups(
    var accountId: Int,
    var clientId: Int? = null,
    var extended: Boolean? = null
) : VkMethod<List<TargetGroup>>("ads.getTargetGroups", jacksonTypeRef()),
    UserMethod
