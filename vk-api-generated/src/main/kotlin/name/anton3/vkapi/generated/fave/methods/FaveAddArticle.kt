@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/fave.addArticle]
 *
 * No description
 *
 * @property url No description
 */
data class FaveAddArticle(
    var url: String
) : VkMethod<BoolInt, UserMethod>("fave.addArticle", jacksonTypeRef())
