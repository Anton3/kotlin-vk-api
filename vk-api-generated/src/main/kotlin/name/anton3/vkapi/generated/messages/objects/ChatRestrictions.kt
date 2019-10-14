@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * No description
 *
 * @property adminsPromoteUsers Only admins can promote users to admins
 * @property onlyAdminsEditInfo Only admins can change chat info
 * @property onlyAdminsEditPin Only admins can edit pinned message
 * @property onlyAdminsInvite Only admins can invite users to this chat
 * @property onlyAdminsKick Only admins can kick users from this chat
 */
data class ChatRestrictions(
    val adminsPromoteUsers: Boolean? = null,
    val onlyAdminsEditInfo: Boolean? = null,
    val onlyAdminsEditPin: Boolean? = null,
    val onlyAdminsInvite: Boolean? = null,
    val onlyAdminsKick: Boolean? = null
)
