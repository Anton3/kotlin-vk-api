@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.setPageTags]
 *
 * No description
 *
 * @property userId No description
 * @property groupId No description
 * @property tagIds No description
 */
data class FaveSetPageTags(
    var userId: Int? = null,
    var groupId: Int? = null,
    var tagIds: List<Int>? = null
) : VkMethod<OkResponse, UserMethod>("fave.setPageTags", jacksonTypeRef())
