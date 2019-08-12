@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.utils.objects.ShortLink
import name.anton3.vkapi.method.UserGroupServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/utils.getShortLink]
 *
 * Allows to receive a link shortened via vk.cc.
 *
 * @property url URL to be shortened.
 * @property private 1 — private stats, 0 — public stats.
 */
data class UtilsGetShortLink(
    var url: String,
    var private: Boolean? = null
) : VkMethod<ShortLink, UserGroupServiceMethod>("utils.getShortLink", jacksonTypeRef())
