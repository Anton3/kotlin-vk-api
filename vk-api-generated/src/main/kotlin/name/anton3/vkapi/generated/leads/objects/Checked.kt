@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.objects

/**
 * No description
 *
 * @property reason Reason why user can't start the lead
 * @property result No description
 * @property sid Session ID
 * @property startLink URL user should open to start the lead
 */
data class Checked(
    val reason: String? = null,
    val result: CheckedResult? = null,
    val sid: String? = null,
    val startLink: String? = null
)
