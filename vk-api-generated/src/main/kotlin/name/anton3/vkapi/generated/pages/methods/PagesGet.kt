@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.pages.objects.WikipageFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

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
 * @property needSource No description
 * @property needHtml '1' — to return the page as HTML,
 */
data class PagesGet(
    var ownerId: Int? = null,
    var pageId: Int? = null,
    var global: Boolean? = null,
    var sitePreview: Boolean? = null,
    var title: String? = null,
    var needSource: Boolean? = null,
    var needHtml: Boolean? = null
) : VkMethod<WikipageFull, UserMethod>("pages.get", jacksonTypeRef())
