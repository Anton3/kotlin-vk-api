@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.closeTopic]
 *
 * Closes a topic on a community's discussion board so that comments cannot be posted.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
data class BoardCloseTopic(
    var groupId: Long,
    var topicId: Long
) : VkMethod<OkResponse>(
    "board.closeTopic",
    jacksonTypeRef()
), UserMethod
