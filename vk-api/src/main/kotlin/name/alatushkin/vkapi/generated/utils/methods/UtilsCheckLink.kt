@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.utils.objects.LinkChecked
import name.alatushkin.vkapi.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.checkLink]
 *
 * Checks whether a link is blocked in VK.
 *
 * @property url Link to check (e.g., 'http://google.com').
 */
data class UtilsCheckLink(
    var url: String
) : VkMethod<LinkChecked>(
    "utils.checkLink",
    jacksonTypeRef()
), UserGroupServiceMethod
