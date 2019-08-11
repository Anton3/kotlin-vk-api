@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.getServerTime]
 *
 * Returns the current time of the VK server.
 *

 */
class UtilsGetServerTime : CheckedMethod<Int, UserGroupServiceMethod>("utils.getServerTime", jacksonTypeRef())
