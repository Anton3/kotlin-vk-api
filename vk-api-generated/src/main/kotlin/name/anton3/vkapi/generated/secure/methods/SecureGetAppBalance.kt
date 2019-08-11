@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.ServiceMethod

/**
 * [https://vk.com/dev/secure.getAppBalance]
 *
 * Returns payment balance of the application in hundredth of a vote.
 *

 */
class SecureGetAppBalance : CheckedMethod<Int, ServiceMethod>("secure.getAppBalance", jacksonTypeRef())
