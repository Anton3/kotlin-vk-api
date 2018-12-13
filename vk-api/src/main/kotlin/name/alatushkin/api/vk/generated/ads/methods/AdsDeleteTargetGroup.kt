@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.deleteTargetGroup]
 *
 * Deletes a retarget group.
 *
 * @property accountId Advertising account ID.
 * @property clientId 'Only for advertising agencies.' , ID of the client with the advertising account where the group will be created.
 * @property targetGroupId Group ID.
 */
data class AdsDeleteTargetGroup(
    var accountId: Long,
    var clientId: Long? = null,
    var targetGroupId: Long
) : VkMethod<OkResponse>(
    "ads.deleteTargetGroup",
    jacksonTypeRef()
), UserMethod
