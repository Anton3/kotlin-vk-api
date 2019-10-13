@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.pages.objects.WikipageFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/pages.getVersion]
 *
 * Returns the text of one of the previous versions of a wiki page.
 *
 * @property versionId No description
 * @property groupId ID of the community that owns the wiki page.
 * @property userId No description
 * @property needHtml '1' — to return the page as HTML
 */
data class PagesGetVersion(
    var versionId: Int,
    var groupId: Int? = null,
    var userId: Int? = null,
    var needHtml: Boolean? = null
) : VkMethod<WikipageFull, UserMethod>("pages.getVersion", jacksonTypeRef())
