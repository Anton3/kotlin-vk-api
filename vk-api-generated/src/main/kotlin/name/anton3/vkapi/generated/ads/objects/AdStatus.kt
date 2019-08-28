@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class AdStatus(override val value: Int) : ValueEnum<Int> {
    STOPPED(0),
    STARTED(1),
    DELETED(2)
}
