@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.secure.objects.Transaction
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getTransactionsHistory]
 *
 * Shows history of votes transaction between users and the application.
 *

 */
class SecureGetTransactionsHistory : VkMethod<List<Transaction>>(
    "secure.getTransactionsHistory",
    jacksonTypeRef()
), ServiceMethod
