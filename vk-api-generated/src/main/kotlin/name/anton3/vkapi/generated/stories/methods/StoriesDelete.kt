@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stories.delete]
 *
 * Allows to delete story.
 *
 * @property ownerId Story owner's ID. Current user id is used by default.
 * @property storyId Story ID.
 */
data class StoriesDelete(
    var ownerId: Int,
    var storyId: Int
) : CheckedMethod<OkResponse, UserGroupMethod>("stories.delete", jacksonTypeRef())
