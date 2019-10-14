@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class CallbackServerStatus(override val value: String) : ValueEnum<String> {
    UNCONFIGURED("unconfigured"),
    FAILED("failed"),
    WAIT("wait"),
    OK("ok")
}
