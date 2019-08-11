@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.secure.objects.Level
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.ServiceMethod

/**
 * [https://vk.com/dev/secure.getUserLevel]
 *
 * Returns one of the previously set game levels of one or more users in the application.
 *
 * @property userIds No description
 */
data class SecureGetUserLevel(
    var userIds: List<Int>
) : CheckedMethod<List<Level>, ServiceMethod>("secure.getUserLevel", jacksonTypeRef())
