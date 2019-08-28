@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class AdApproved(override val value: Int) : ValueEnum<Int> {
    NOT_MODERATED(0),
    PENDING_MODERATION(1),
    APPROVED(2),
    REJECTED(3)
}
