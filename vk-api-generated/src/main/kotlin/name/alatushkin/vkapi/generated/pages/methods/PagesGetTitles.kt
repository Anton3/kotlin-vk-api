@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.pages.objects.Wikipage
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getTitles]
 *
 * Returns a list of wiki pages in a group.
 *
 * @property groupId ID of the community that owns the wiki page.
 */
data class PagesGetTitles(
    var groupId: Long? = null
) : VkMethod<List<Wikipage>>("pages.getTitles", jacksonTypeRef()),
    UserMethod
