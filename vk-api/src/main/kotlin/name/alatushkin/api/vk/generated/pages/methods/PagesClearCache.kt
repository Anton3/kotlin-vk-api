@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/pages.clearCache]
 *
 * Allows to clear the cache of particular 'external' pages which may be attached to VK posts.
 *
 * @property url Address of the page where you need to refesh the cached version
 */
data class PagesClearCache(
    var url: String
) : VkMethod<OkResponse>(
    "pages.clearCache",
    jacksonTypeRef()
), UserServiceMethod
