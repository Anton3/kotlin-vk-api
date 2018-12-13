@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.getScore]
 *
 * Returns user score in app
 *
 * @property userId 
 */
data class AppsGetScore(
    var userId: Long
) : VkMethod<Long>(
    "apps.getScore",
    jacksonTypeRef()
), UserMethod
