@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.editTag]
 *
 * No description
 *
 * @property id No description
 * @property name No description
 */
data class FaveEditTag(
    var id: Int,
    var name: String
) : VkMethod<OkResponse, UserMethod>("fave.editTag", jacksonTypeRef())
