package name.anton3.vkapi.generated.ads.objects

/**
 * No description
 *
 * @property accountId Account ID
 * @property accountType No description
 * @property accountStatus Information whether account is active
 * @property accessRole No description
 */
data class Account(
    val accountId: Long,
    val accountType: AccountType,
    val accountStatus: Boolean,
    val accessRole: AccessRole
)
