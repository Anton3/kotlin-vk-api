@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.TargetGroup
import name.alatushkin.vkapi.tokens.UserMethod

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
    var accountId: Long,
    var clientId: Long? = null,
    var extended: Boolean? = null
) : VkMethod<List<TargetGroup>>("ads.getTargetGroups", jacksonTypeRef()),
    UserMethod
