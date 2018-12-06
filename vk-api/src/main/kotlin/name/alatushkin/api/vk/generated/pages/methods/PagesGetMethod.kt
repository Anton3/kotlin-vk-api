@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.pages.WikipageFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

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
class PagesGetMethod(
    ownerId: Long? = null,
    pageId: Long? = null,
    global: Boolean? = null,
    sitePreview: Boolean? = null,
    title: String? = null,
    needSource: Boolean? = null,
    needHtml: Boolean? = null
) : VkMethod<WikipageFull>(
    "pages.get",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var pageId: Long? by props
    var global: Boolean? by props
    var sitePreview: Boolean? by props
    var title: String? by props
    var needSource: Boolean? by props
    var needHtml: Boolean? by props

    init {
        this.ownerId = ownerId
        this.pageId = pageId
        this.global = global
        this.sitePreview = sitePreview
        this.title = title
        this.needSource = needSource
        this.needHtml = needHtml
    }
}
