@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.stories.objects.Story
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.VkList

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
data class StoriesGetReplies(
    var ownerId: Int,
    var storyId: Int,
    var accessKey: String? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<List<Story>>>("stories.getReplies", jacksonTypeRef()),
    UserGroupMethod
