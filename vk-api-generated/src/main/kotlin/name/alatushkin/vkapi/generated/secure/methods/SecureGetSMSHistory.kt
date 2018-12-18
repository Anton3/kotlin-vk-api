@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.secure.objects.SmsNotification
import name.anton3.vkapi.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getSMSHistory]
 *
 * Shows a list of SMS notifications sent by the application using [vk.com/dev/secure.sendSMSNotification|secure.sendSMSNotification] method.
 *
 * @property userId No description
 * @property dateFrom filter by start date. It is set as UNIX-time.
 * @property dateTo filter by end date. It is set as UNIX-time.
 * @property limit number of returned posts. By default — 1000.
 */
data class SecureGetSMSHistory(
    var userId: Long? = null,
    var dateFrom: Long? = null,
    var dateTo: Long? = null,
    var limit: Long? = null
) : VkMethod<List<SmsNotification>>("secure.getSMSHistory", jacksonTypeRef()),
    ServiceMethod
