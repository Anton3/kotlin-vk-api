@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/newsfeed.deleteBan]
 *
 * Allows news from previously banned users and communities to be shown in the current user's newsfeed.
 *
 * @property userIds No description
 * @property groupIds No description
 */
data class NewsfeedDeleteBan(
    var userIds: List<Long>? = null,
    var groupIds: List<Long>? = null
) : VkMethod<OkResponse>("newsfeed.deleteBan", jacksonTypeRef()),
    UserMethod
