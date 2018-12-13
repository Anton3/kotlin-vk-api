@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.pages.objects.Wikipage
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getTitles]
 *
 * Returns a list of wiki pages in a group.
 *
 * @property groupId ID of the community that owns the wiki page.
 */
data class PagesGetTitles(
    var groupId: Long? = null
) : VkMethod<List<Wikipage>>(
    "pages.getTitles",
    jacksonTypeRef()
), UserMethod
