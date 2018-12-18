@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.pages.objects.Access
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.saveAccess]
 *
 * Saves modified read and edit access settings for a wiki page.
 *
 * @property pageId Wiki page ID.
 * @property groupId ID of the community that owns the wiki page.
 * @property userId
 * @property view Who can view the wiki page: '1' — only community members, '2' — all users can view the page, '0' — only community managers
 * @property edit Who can edit the wiki page: '1' — only community members, '2' — all users can edit the page, '0' — only community managers
 */
data class PagesSaveAccess(
    var pageId: Long,
    var groupId: Long? = null,
    var userId: Long? = null,
    var view: Access? = null,
    var edit: Access? = null
) : VkMethod<Long>("pages.saveAccess", jacksonTypeRef()),
    UserMethod
