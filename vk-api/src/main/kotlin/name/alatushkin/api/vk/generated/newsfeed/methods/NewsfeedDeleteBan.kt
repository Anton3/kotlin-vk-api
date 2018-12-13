@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.deleteBan]
 *
 * Allows news from previously banned users and communities to be shown in the current user's newsfeed.
 *
 * @property userIds 
 * @property groupIds 
 */
data class NewsfeedDeleteBan(
    var userIds: List<Long>? = null,
    var groupIds: List<Long>? = null
) : VkMethod<OkResponse>(
    "newsfeed.deleteBan",
    jacksonTypeRef()
), UserMethod
