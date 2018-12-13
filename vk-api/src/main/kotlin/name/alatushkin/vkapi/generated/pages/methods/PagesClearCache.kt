@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserServiceMethod

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
