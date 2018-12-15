package name.alatushkin.vkapi.generated.leads.objects

/**
 * No description
 *
 * @property result No description
 * @property reason Reason why user can't start the lead
 * @property startLink URL user should open to start the lead
 * @property sid Session ID
 */
data class Checked(
    val result: CheckedResult? = null,
    val reason: String? = null,
    val startLink: String? = null,
    val sid: String? = null
)
