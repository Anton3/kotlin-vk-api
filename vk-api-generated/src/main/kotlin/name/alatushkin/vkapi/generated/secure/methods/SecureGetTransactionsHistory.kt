@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.secure.objects.Transaction
import name.alatushkin.vkapi.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getTransactionsHistory]
 *
 * Shows history of votes transaction between users and the application.
 *

 */
class SecureGetTransactionsHistory : VkMethod<List<Transaction>>("secure.getTransactionsHistory", jacksonTypeRef()),
    ServiceMethod
