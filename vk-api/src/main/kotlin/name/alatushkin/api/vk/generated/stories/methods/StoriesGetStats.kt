@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.stories.objects.StoryStats
import name.alatushkin.api.vk.tokens.UserGroupMethod

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
) : VkMethod<StoryStats>(
    "stories.getStats",
    jacksonTypeRef()
), UserGroupMethod
