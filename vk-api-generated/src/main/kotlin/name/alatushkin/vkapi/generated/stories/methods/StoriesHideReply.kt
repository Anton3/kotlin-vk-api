@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

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
) : VkMethod<OkResponse>("stories.hideReply", jacksonTypeRef()),
    UserGroupMethod
