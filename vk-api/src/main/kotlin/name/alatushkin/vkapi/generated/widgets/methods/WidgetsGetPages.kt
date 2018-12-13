@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.widgets.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.widgets.objects.GetPagesResponse
import name.alatushkin.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/widgets.getPages]
 *
 * Gets a list of application/site pages where the [vk.com/dev/Comments|Comments widget] or [vk.com/dev/Like|Like widget] is installed.
 *
 * @property widgetApiId 
 * @property order 
 * @property period 
 * @property count 
 */
data class WidgetsGetPages(
    var widgetApiId: Long? = null,
    var order: String? = null,
    var period: String? = null,
    var count: Long? = null
) : VkMethod<GetPagesResponse>(
    "widgets.getPages",
    jacksonTypeRef()
), UserServiceMethod
