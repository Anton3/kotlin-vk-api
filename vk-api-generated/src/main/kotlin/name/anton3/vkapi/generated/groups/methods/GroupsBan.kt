@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.ban]
 *
 * No description
 *
 * @property groupId No description
 * @property ownerId No description
 * @property endDate No description
 * @property reason No description
 * @property comment No description
 * @property commentVisible No description
 */
data class GroupsBan(
    var groupId: Int,
    var ownerId: Int? = null,
    var endDate: Int? = null,
    var reason: Int? = null,
    var comment: String? = null,
    var commentVisible: Boolean? = null
) : VkMethod<OkResponse, UserMethod>("groups.ban", jacksonTypeRef())
