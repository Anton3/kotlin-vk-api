@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

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
    var groupId: Int? = null
) : CheckedMethod<String, UserMethod>("pages.parseWiki", jacksonTypeRef())
