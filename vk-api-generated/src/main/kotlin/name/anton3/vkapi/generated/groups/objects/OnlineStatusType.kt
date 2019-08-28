@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class OnlineStatusType(override val value: String) : ValueEnum<String> {
    NONE("none"),
    ONLINE("online"),
    ANSWER_MARK("answer_mark")
}
