@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.places.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class SearchRadius(override val value: Int) : ValueEnum<Int> {
    N_100_M(1),
    N_800_M(2),
    N_6_KM(3),
    N_50_KM(4)
}
