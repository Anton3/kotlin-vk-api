@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.secure.objects.Transaction
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.ServiceMethod

/**
 * [https://vk.com/dev/secure.getTransactionsHistory]
 *
 * Shows history of votes transaction between users and the application.
 *

 */
class SecureGetTransactionsHistory : CheckedMethod<List<Transaction>, ServiceMethod>("secure.getTransactionsHistory", jacksonTypeRef())
