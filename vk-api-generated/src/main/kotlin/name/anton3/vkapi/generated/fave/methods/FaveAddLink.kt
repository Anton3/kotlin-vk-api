@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.addLink]
 *
 * Adds a link to user faves.
 *
 * @property link Link URL.
 * @property text Description text.
 */
data class FaveAddLink(
    var link: String,
    var text: String? = null
) : VkMethod<OkResponse>("fave.addLink", jacksonTypeRef()),
    UserMethod
