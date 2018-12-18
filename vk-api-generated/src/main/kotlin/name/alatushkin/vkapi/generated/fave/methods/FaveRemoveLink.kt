@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.removeLink]
 *
 * Removes link from the user's faves.
 *
 * @property linkId Link ID (can be obtained by [vk.com/dev/faves.getLinks|faves.getLinks] method).
 */
data class FaveRemoveLink(
    var linkId: String
) : VkMethod<OkResponse>("fave.removeLink", jacksonTypeRef()),
    UserMethod
