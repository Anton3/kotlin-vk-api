@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ConversationCanWriteReason(override val value: Int) : ValueEnum<Int> {
    USER_DELETED(18),
    USER_IS_BLACKLISTED(900),
    USER_BLACKLISTED_COMMUNITY(901),
    USER_BLOCKED_MESSAGES(902),
    COMMUNITY_DISABLED_MESSAGES(915),
    COMMUNITY_BLOCKED_MESSAGES(916),
    NO_CONVERSATION_ACCESS(917),
    NO_EMAIL_ACCESS(918),
    NO_COMMUNITY_ACCESS(203)
}
