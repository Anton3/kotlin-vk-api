@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/board.restoreComment]
 *
 * Restores a comment deleted from a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property commentId Comment ID.
 */
data class BoardRestoreComment(
    var groupId: Long,
    var topicId: Long,
    var commentId: Long
) : VkMethod<OkResponse>(
    "board.restoreComment",
    jacksonTypeRef()
), UserGroupMethod
