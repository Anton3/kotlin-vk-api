@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "fave.addLink",
    jacksonTypeRef()
), UserMethod
