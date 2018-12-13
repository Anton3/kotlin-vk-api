@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.widgets.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.widgets.objects.GetCommentsResponse
import name.alatushkin.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/widgets.getComments]
 *
 * Gets a list of comments for the page added through the [vk.com/dev/Comments|Comments widget].
 *
 * @property widgetApiId 
 * @property url 
 * @property pageId 
 * @property order 
 * @property fields 
 * @property count 
 */
data class WidgetsGetComments(
    var widgetApiId: Long? = null,
    var url: String? = null,
    var pageId: String? = null,
    var order: String? = null,
    var fields: List<String>? = null,
    var count: Long? = null
) : VkMethod<GetCommentsResponse>(
    "widgets.getComments",
    jacksonTypeRef()
), UserServiceMethod
