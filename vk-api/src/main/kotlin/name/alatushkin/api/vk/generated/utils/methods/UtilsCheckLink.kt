@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.utils.objects.LinkChecked
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

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
