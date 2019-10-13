@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.appWidgets.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.appWidgets.objects.UpdateType
import name.anton3.vkapi.method.GroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/appWidgets.update]
 *
 * Allows to update community app widget
 *
 * @property code No description
 * @property type No description
 */
data class AppWidgetsUpdate(
    var code: String,
    var type: UpdateType
) : VkMethod<OkResponse, GroupMethod>("appWidgets.update", jacksonTypeRef())
