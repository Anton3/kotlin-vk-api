@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
