@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/pages.clearCache]
 *
 * Allows to clear the cache of particular 'external' pages which may be attached to VK posts.
 *
 * @property url Address of the page where you need to refesh the cached version
 */
data class PagesClearCache(
    var url: String
) : CheckedMethod<OkResponse, UserServiceMethod>("pages.clearCache", jacksonTypeRef())
