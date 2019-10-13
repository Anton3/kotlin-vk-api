@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetFilters(override val value: String) : ValueEnum<String> {
    WALL("wall"),
    MENTIONS("mentions"),
    COMMENTS("comments"),
    LIKES("likes"),
    REPOSTED("reposted"),
    FOLLOWERS("followers"),
    FRIENDS("friends")
}
