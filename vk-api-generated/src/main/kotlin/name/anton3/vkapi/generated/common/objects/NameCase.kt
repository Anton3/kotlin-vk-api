@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class NameCase(override val value: String) : ValueEnum<String> {
    NOMINATIVE("nom"),
    GENITIVE("gen"),
    DATIVE("dat"),
    ACCUSATIVE("acc"),
    INSTRUMENTAL("ins"),
    PREPOSITIONAL("abl")
}
