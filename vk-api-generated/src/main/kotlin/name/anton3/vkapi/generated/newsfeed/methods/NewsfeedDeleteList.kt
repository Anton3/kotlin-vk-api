@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.MethodRequirement
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/newsfeed.deleteList]
 *
 * No description
 *
 * @property listId No description
 */
data class NewsfeedDeleteList(
    var listId: Int
) : VkMethod<OkResponse, MethodRequirement>("newsfeed.deleteList", jacksonTypeRef())
