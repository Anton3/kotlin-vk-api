@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.parseWiki]
 *
 * Returns HTML representation of the wiki markup.
 *
 * @property text Text of the wiki page.
 * @property groupId ID of the group in the context of which this markup is interpreted.
 */
data class PagesParseWiki(
    var text: String,
    var groupId: Long? = null
) : VkMethod<String>(
    "pages.parseWiki",
    jacksonTypeRef()
), UserMethod
