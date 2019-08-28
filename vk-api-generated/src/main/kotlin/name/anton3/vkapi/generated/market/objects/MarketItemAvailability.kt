@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class MarketItemAvailability(override val value: Int) : ValueEnum<Int> {
    AVAILABLE(0),
    REMOVED(1),
    UNAVAILABLE(2)
}
