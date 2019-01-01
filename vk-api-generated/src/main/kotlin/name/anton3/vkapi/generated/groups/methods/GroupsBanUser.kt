@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.groups.objects.BanUserReason
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.banUser]
 *
 * Adds a user to a community blacklist.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 * @property endDate Date (in Unix time) when the user will be removed from the blacklist.
 * @property reason Reason for ban: '1' — spam, '2' — verbal abuse, '3' — strong language, '4' — irrelevant messages, '0' — other (default)
 * @property comment Text of comment to ban.
 * @property commentVisible '1' — text of comment will be visible to the user,, '0' — text of comment will be invisible to the user. By default: '0'.
 */
data class GroupsBanUser(
    var groupId: Int,
    var userId: Int,
    var endDate: Int? = null,
    var reason: BanUserReason? = null,
    var comment: String? = null,
    var commentVisible: Boolean? = null
) : VkMethod<OkResponse>("groups.banUser", jacksonTypeRef()),
    UserMethod
