@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.getServerTime]
 *
 * Returns the current time of the VK server.
 *

 */
class UtilsGetServerTime : VkMethod<Long>(
    "utils.getServerTime",
    jacksonTypeRef()
), UserGroupServiceMethod
