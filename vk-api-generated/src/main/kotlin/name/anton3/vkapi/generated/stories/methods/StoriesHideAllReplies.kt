@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stories.hideAllReplies]
 *
 * Hides all replies in the last 24 hours from the user to current user's stories.
 *
 * @property ownerId ID of the user whose replies should be hidden.
 */
data class StoriesHideAllReplies(
    var ownerId: Int
) : CheckedMethod<OkResponse, UserGroupMethod>("stories.hideAllReplies", jacksonTypeRef())
