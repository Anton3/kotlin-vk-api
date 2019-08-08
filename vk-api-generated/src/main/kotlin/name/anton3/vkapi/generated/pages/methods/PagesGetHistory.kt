@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.pages.objects.WikipageVersion
import name.anton3.vkapi.method.UserMethod

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
    var pageId: Int,
    var groupId: Int? = null,
    var userId: Int? = null
) : VkMethod<List<WikipageVersion>>("pages.getHistory", jacksonTypeRef()),
    UserMethod
