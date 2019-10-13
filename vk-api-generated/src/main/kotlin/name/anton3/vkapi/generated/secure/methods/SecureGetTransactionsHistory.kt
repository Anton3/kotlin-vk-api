@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.secure.objects.Transaction
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/secure.getTransactionsHistory]
 *
 * Shows history of votes transaction between users and the application.
 *
 * @property type No description
 * @property uidFrom No description
 * @property uidTo No description
 * @property dateFrom No description
 * @property dateTo No description
 * @property limit No description
 */
data class SecureGetTransactionsHistory(
    var type: Int? = null,
    var uidFrom: Int? = null,
    var uidTo: Int? = null,
    var dateFrom: Int? = null,
    var dateTo: Int? = null,
    var limit: Int? = null
) : VkMethod<List<Transaction>, ServiceMethod>("secure.getTransactionsHistory", jacksonTypeRef())
