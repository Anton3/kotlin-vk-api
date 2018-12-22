@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.stories.objects.StoryStats
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getStats]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Story owner ID.
 * @property storyId Story ID.
 */
data class StoriesGetStats(
    var ownerId: Long,
    var storyId: Long
) : VkMethod<StoryStats>("stories.getStats", jacksonTypeRef()),
    UserGroupMethod