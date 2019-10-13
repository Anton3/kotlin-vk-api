@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ReportType(override val value: String) : ValueEnum<String> {
    PORN("porn"),
    SPAM("spam"),
    INSULT("insult"),
    ADVERTISEMENT("advertisement")
}
