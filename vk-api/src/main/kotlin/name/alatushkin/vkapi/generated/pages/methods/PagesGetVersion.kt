@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.pages.objects.WikipageFull
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getVersion]
 *
 * Returns the text of one of the previous versions of a wiki page.
 *
 * @property versionId 
 * @property groupId ID of the community that owns the wiki page.
 * @property userId 
 * @property needHtml '1' — to return the page as HTML
 */
data class PagesGetVersion(
    var versionId: Long,
    var groupId: Long? = null,
    var userId: Long? = null,
    var needHtml: Boolean? = null
) : VkMethod<WikipageFull>(
    "pages.getVersion",
    jacksonTypeRef()
), UserMethod
