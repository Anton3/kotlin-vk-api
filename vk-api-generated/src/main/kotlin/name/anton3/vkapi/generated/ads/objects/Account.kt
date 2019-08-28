@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property accountId Account ID
 * @property accountType No description
 * @property accountStatus Information whether account is active
 * @property accessRole No description
 */
data class Account(
    val accountId: Int,
    val accountType: AccountType,
    val accountStatus: BoolInt,
    val accessRole: AccessRole
)
