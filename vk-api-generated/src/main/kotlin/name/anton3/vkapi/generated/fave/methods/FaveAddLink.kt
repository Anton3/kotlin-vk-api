@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.addLink]
 *
 * Adds a link to user faves.
 *
 * @property link Link URL.
 */
data class FaveAddLink(
    var link: String
) : VkMethod<OkResponse, UserMethod>("fave.addLink", jacksonTypeRef())
