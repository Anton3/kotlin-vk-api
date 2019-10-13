@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.notifications.objects.SendMessageItem
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/notifications.sendMessage]
 *
 * No description
 *
 * @property userIds No description
 * @property message No description
 * @property fragment No description
 * @property groupId No description
 */
data class NotificationsSendMessage(
    var userIds: List<Int>,
    var message: String,
    var fragment: String? = null,
    var groupId: Int? = null
) : VkMethod<List<SendMessageItem>, UserServiceMethod>("notifications.sendMessage", jacksonTypeRef())
