@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/fave.removeLink]
 *
 * Removes link from the user's faves.
 *
 * @property linkId Link ID (can be obtained by [vk.com/dev/faves.getLinks|faves.getLinks] method).
 */
data class FaveRemoveLink(
    var linkId: String
) : VkMethod<OkResponse>(
    "fave.removeLink",
    jacksonTypeRef()
), UserMethod
