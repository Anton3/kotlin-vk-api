@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/fave.removeArticle]
 *
 * No description
 *
 * @property ownerId No description
 * @property articleId No description
 */
data class FaveRemoveArticle(
    var ownerId: Int,
    var articleId: Int
) : VkMethod<BoolInt, UserMethod>("fave.removeArticle", jacksonTypeRef())
