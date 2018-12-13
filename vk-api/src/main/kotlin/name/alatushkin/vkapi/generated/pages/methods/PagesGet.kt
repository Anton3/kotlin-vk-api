@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.pages.objects.WikipageFull
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.get]
 *
 * Returns information about a wiki page.
 *
 * @property ownerId Page owner ID.
 * @property pageId Wiki page ID.
 * @property global '1' — to return information about a global wiki page
 * @property sitePreview '1' — resulting wiki page is a preview for the attached link
 * @property title Wiki page title.
 * @property needSource 
 * @property needHtml '1' — to return the page as HTML,
 */
data class PagesGet(
    var ownerId: Long? = null,
    var pageId: Long? = null,
    var global: Boolean? = null,
    var sitePreview: Boolean? = null,
    var title: String? = null,
    var needSource: Boolean? = null,
    var needHtml: Boolean? = null
) : VkMethod<WikipageFull>(
    "pages.get",
    jacksonTypeRef()
), UserMethod
