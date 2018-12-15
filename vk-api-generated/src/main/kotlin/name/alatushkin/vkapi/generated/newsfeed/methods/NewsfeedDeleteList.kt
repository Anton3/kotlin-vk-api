@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/newsfeed.deleteList]
 *
 * No description
 *
 * @property listId No description
 */
data class NewsfeedDeleteList(
    var listId: Long
) : VkMethod<OkResponse>("newsfeed.deleteList", jacksonTypeRef())
