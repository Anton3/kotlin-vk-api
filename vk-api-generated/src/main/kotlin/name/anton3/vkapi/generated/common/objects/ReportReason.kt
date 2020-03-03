@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ReportReason(override val value: Int) : ValueEnum<Int> {
    SPAM(0),
    CHILD_PORNOGRAPHY(1),
    EXTREMISM(2),
    VIOLENCE(3),
    DRUG_PROPAGANDA(4),
    ADULT_MATERIAL(5),
    INSULT_ABUSE(6)
}
