@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.deleteAppRequests]
 *
 * Deletes all request notifications from the current app.
 *

 */
class AppsDeleteAppRequests : VkMethod<OkResponse>(
    "apps.deleteAppRequests",
    jacksonTypeRef()
), UserMethod
