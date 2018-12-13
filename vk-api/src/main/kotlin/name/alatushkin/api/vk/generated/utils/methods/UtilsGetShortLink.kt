@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.utils.objects.ShortLink
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

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
) : VkMethod<ShortLink>(
    "utils.getShortLink",
    jacksonTypeRef()
), UserGroupServiceMethod
