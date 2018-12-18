@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.save]
 *
 * Saves the text of a wiki page.
 *
 * @property text Text of the wiki page in wiki-format.
 * @property pageId Wiki page ID. The 'title' parameter can be passed instead of 'pid'.
 * @property groupId ID of the community that owns the wiki page.
 * @property userId User ID
 * @property title Wiki page title.
 */
data class PagesSave(
    var text: String? = null,
    var pageId: Long? = null,
    var groupId: Long? = null,
    var userId: Long? = null,
    var title: String? = null
) : VkMethod<Long>("pages.save", jacksonTypeRef()),
    UserMethod
