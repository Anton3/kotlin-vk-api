@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property accessRole No description
 * @property accountId Account ID
 * @property accountStatus Information whether account is active
 * @property accountType No description
 */
data class Account(
    val accessRole: AccessRole,
    val accountId: Int,
    val accountStatus: BoolInt,
    val accountType: AccountType
)
