@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.responses

import name.anton3.vkapi.vktypes.ValueEnum

enum class AddResponse(override val value: Int) : ValueEnum<Int> {
    SEND(1),
    APPROVED(2),
    RESEND(4)
}
