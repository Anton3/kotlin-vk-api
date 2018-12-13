@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.hideReply]
 *
 * Hides the reply to the current user's story.
 *
 * @property ownerId ID of the user whose replies should be hidden.
 * @property storyId Story ID.
 * @property accessKey Access key for the private object.
 */
data class StoriesHideReply(
    var ownerId: Long,
    var storyId: Long,
    var accessKey: String? = null
) : VkMethod<OkResponse>(
    "stories.hideReply",
    jacksonTypeRef()
), UserGroupMethod
