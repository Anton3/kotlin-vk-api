@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.stories.objects.GetRepliesExtendedResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getReplies]
 *
 * Returns replies to the story.
 *
 * @property ownerId Story owner ID.
 * @property storyId Story ID.
 * @property accessKey Access key for the private object.
 * @property fields Additional fields to return
 */
data class StoriesGetRepliesExtended(
    var ownerId: Long,
    var storyId: Long,
    var accessKey: String? = null,
    var fields: List<String>? = null
) : VkMethod<GetRepliesExtendedResponse>(
    "stories.getReplies",
    jacksonTypeRef()
), UserGroupMethod {
    init {
        unsafeParam("extended", "1")
    }
}
