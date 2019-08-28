@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetNearbyRadius(override val value: Int) : ValueEnum<Int> {
    ANY(0),
    N_300_M(1),
    N_2400_M(2),
    N_18_KM(3),
    N_150_KM(4)
}
