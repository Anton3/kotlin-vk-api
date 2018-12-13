@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.pages.objects.WikipageVersion
import name.alatushkin.api.vk.tokens.UserMethod

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
