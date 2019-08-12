@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/newsfeed.addBan]
 *
 * Prevents news from specified users and communities from appearing in the current user's newsfeed.
 *
 * @property userIds No description
 * @property groupIds No description
 */
data class NewsfeedAddBan(
    var userIds: List<Int>? = null,
    var groupIds: List<Int>? = null
) : VkMethod<OkResponse, UserMethod>("newsfeed.addBan", jacksonTypeRef())
