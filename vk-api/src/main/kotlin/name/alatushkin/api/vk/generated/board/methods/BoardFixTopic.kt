@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.fixTopic]
 *
 * Pins a topic (fixes its place) to the top of a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 */
data class BoardFixTopic(
    var groupId: Long,
    var topicId: Long
) : VkMethod<OkResponse>(
    "board.fixTopic",
    jacksonTypeRef()
), UserMethod
