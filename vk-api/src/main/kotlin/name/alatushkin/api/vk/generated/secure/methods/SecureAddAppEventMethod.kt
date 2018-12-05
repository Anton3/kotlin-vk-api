@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/secure.addAppEvent]
 *
 * Adds user activity information to an application
 *
 * @property userId ID of a user to save the data
 * @property activityId there are 2 default activities: , * 1 – level. Works similar to ,, * 2 – points, saves points amount, Any other value is for saving completed missions
 * @property value depends on activity_id: * 1 – number, current level number,, * 2 – number, current user's points amount, , Any other value is ignored
 */
class SecureAddAppEventMethod(
        userId: Long,
        activityId: Long,
        value: Long? = null
) : VkMethod<Boolean>(
    "secure.addAppEvent",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var userId: Long by props
    var activityId: Long by props
    var value: Long? by props

    init {
        this.userId = userId
        this.activityId = activityId
        this.value = value
    }

    fun setUserId(userId: Long): SecureAddAppEventMethod {
        this.userId = userId
        return this
    }

    fun setActivityId(activityId: Long): SecureAddAppEventMethod {
        this.activityId = activityId
        return this
    }

    fun setValue(value: Long): SecureAddAppEventMethod {
        this.value = value
        return this
    }
}
