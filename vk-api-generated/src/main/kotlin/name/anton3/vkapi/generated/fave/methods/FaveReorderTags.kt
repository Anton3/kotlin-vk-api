@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.reorderTags]
 *
 * No description
 *
 * @property ids No description
 */
data class FaveReorderTags(
    var ids: List<Int>
) : VkMethod<OkResponse, UserMethod>("fave.reorderTags", jacksonTypeRef())
