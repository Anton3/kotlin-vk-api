@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getAppBalance]
 *
 * Returns payment balance of the application in hundredth of a vote.
 *

 */
class SecureGetAppBalance : VkMethod<Long>("secure.getAppBalance", jacksonTypeRef()),
    ServiceMethod
