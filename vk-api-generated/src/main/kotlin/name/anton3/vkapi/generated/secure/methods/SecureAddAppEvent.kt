@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/secure.addAppEvent]
 *
 * Adds user activity information to an application
 *
 * @property userId ID of a user to save the data
 * @property activityId there are 2 default activities: , * 1 – level. Works similar to ,, * 2 – points, saves points amount, Any other value is for saving completed missions
 * @property value depends on activity_id: * 1 – number, current level number,, * 2 – number, current user's points amount, , Any other value is ignored
 */
data class SecureAddAppEvent(
    var userId: Int,
    var activityId: Int,
    var value: Int? = null
) : CheckedMethod<OkResponse, UserMethod>("secure.addAppEvent", jacksonTypeRef())
