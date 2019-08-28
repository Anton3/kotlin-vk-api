@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GroupFullMainSection(override val value: Int) : ValueEnum<Int> {
    ABSENT(0),
    PHOTOS(1),
    TOPICS(2),
    AUDIO(3),
    VIDEO(4),
    MARKET(5)
}
