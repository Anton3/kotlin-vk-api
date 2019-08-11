@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.utils.objects.LinkChecked
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.checkLink]
 *
 * Checks whether a link is blocked in VK.
 *
 * @property url Link to check (e.g., 'http://google.com').
 */
data class UtilsCheckLink(
    var url: String
) : CheckedMethod<LinkChecked, UserGroupServiceMethod>("utils.checkLink", jacksonTypeRef())
