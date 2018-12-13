@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
    var groupId: Long,
    var link: String,
    var text: String? = null
) : VkMethod<OkResponse>(
    "groups.addLink",
    jacksonTypeRef()
), UserMethod
