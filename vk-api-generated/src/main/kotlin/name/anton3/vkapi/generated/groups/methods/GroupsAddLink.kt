@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.addLink]
 *
 * Allows to add a link to the community.
 *
 * @property groupId Community ID.
 * @property link Link URL.
 * @property text Description text for the link.
 */
data class GroupsAddLink(
    var groupId: Int,
    var link: String,
    var text: String? = null
) : VkMethod<OkResponse>("groups.addLink", jacksonTypeRef()),
    UserMethod
