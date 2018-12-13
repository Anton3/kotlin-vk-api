@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.secure.objects.Level
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getUserLevel]
 *
 * Returns one of the previously set game levels of one or more users in the application.
 *
 * @property userIds 
 */
data class SecureGetUserLevel(
    var userIds: List<Long>
) : VkMethod<List<Level>>(
    "secure.getUserLevel",
    jacksonTypeRef()
), ServiceMethod
