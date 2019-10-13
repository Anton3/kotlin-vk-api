@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class AddressWorkInfoStatus(override val value: String) : ValueEnum<String> {
    NO_INFORMATION("no_information"),
    TEMPORARILY_CLOSED("temporarily_closed"),
    ALWAYS_OPENED("always_opened"),
    TIMETABLE("timetable"),
    FOREVER_CLOSED("forever_closed")
}
