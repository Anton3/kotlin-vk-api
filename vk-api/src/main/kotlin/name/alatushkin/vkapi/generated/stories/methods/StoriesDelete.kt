@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.delete]
 *
 * Allows to delete story.
 *
 * @property ownerId Story owner's ID. Current user id is used by default.
 * @property storyId Story ID.
 */
data class StoriesDelete(
    var ownerId: Long,
    var storyId: Long
) : VkMethod<OkResponse>(
    "stories.delete",
    jacksonTypeRef()
), UserGroupMethod
