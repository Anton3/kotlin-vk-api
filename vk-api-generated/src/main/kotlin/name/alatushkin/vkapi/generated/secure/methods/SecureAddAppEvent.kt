@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
    var userId: Long,
    var activityId: Long,
    var value: Long? = null
) : VkMethod<OkResponse>("secure.addAppEvent", jacksonTypeRef()),
    UserMethod
