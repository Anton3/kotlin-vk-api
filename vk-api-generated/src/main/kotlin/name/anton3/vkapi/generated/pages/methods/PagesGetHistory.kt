@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.pages.objects.WikipageHistory
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/pages.getHistory]
 *
 * Returns a list of all previous versions of a wiki page.
 *
 * @property pageId Wiki page ID.
 * @property groupId ID of the community that owns the wiki page.
 * @property userId No description
 */
data class PagesGetHistory(
    var pageId: Int,
    var groupId: Int? = null,
    var userId: Int? = null
) : VkMethod<List<WikipageHistory>, UserMethod>("pages.getHistory", jacksonTypeRef())
