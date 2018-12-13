@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.pages.objects.WikipageVersion
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getHistory]
 *
 * Returns a list of all previous versions of a wiki page.
 *
 * @property pageId Wiki page ID.
 * @property groupId ID of the community that owns the wiki page.
 * @property userId 
 */
data class PagesGetHistory(
    var pageId: Long,
    var groupId: Long? = null,
    var userId: Long? = null
) : VkMethod<List<WikipageVersion>>(
    "pages.getHistory",
    jacksonTypeRef()
), UserMethod
