@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.addPage]
 *
 * No description
 *
 * @property userId No description
 * @property groupId No description
 */
data class FaveAddPage(
    var userId: Int? = null,
    var groupId: Int? = null
) : VkMethod<OkResponse, UserMethod>("fave.addPage", jacksonTypeRef())
