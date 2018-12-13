@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.addBan]
 *
 * Prevents news from specified users and communities from appearing in the current user's newsfeed.
 *
 * @property userIds 
 * @property groupIds 
 */
data class NewsfeedAddBan(
    var userIds: List<Long>? = null,
    var groupIds: List<Long>? = null
) : VkMethod<OkResponse>(
    "newsfeed.addBan",
    jacksonTypeRef()
), UserMethod
