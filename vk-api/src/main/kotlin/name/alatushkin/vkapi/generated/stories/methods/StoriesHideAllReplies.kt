@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.hideAllReplies]
 *
 * Hides all replies in the last 24 hours from the user to current user's stories.
 *
 * @property ownerId ID of the user whose replies should be hidden.
 */
data class StoriesHideAllReplies(
    var ownerId: Long
) : VkMethod<OkResponse>(
    "stories.hideAllReplies",
    jacksonTypeRef()
), UserGroupMethod
