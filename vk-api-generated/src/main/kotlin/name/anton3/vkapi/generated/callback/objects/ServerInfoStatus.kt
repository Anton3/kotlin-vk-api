@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.callback.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class ServerInfoStatus(override val value: String) : ValueEnum<String> {
    UNCONFIGURED("unconfigured"),
    FAIL("fail"),
    WAIT("wait"),
    OK("ok")
}
