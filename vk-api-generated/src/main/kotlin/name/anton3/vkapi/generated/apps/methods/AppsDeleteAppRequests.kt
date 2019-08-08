@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/apps.deleteAppRequests]
 *
 * Deletes all request notifications from the current app.
 *

 */
class AppsDeleteAppRequests : VkMethod<OkResponse>("apps.deleteAppRequests", jacksonTypeRef()),
    UserMethod
