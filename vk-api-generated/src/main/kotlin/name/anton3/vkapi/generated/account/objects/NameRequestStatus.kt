@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class NameRequestStatus(override val value: String) : ValueEnum<String> {
    SUCCESS("success"),
    PROCESSING("processing"),
    DECLINED("declined"),
    WAS_ACCEPTED("was_accepted"),
    WAS_DECLINED("was_declined")
}
