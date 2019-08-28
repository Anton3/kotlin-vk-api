@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class FriendStatusStatus(override val value: Int) : ValueEnum<Int> {
    NOT_A_FRIEND(0),
    OUTCOMING_REQUEST(1),
    INCOMING_REQUEST(2),
    IS_FRIEND(3)
}
