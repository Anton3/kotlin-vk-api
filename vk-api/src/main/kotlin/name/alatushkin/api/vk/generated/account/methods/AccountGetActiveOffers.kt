@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.account.objects.Offer
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/account.getActiveOffers]
 *
 * Returns a list of active ads (offers) which executed by the user will bring him/her respective number of votes to his balance in the application.
 *
 * @property count Number of results to return.
 */
data class AccountGetActiveOffers(
    var count: Long? = null
) : VkMethod<VkList<Offer>>(
    "account.getActiveOffers",
    jacksonTypeRef()
), UserMethod
