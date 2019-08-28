@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ChangeStateAction(override val value: String) : ValueEnum<String> {
    CANCEL("cancel"),
    CHARGE("charge"),
    REFUND("refund")
}
