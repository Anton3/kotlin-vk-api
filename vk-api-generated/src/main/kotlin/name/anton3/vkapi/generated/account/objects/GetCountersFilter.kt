@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetCountersFilter(override val value: String) : ValueEnum<String> {
    FRIENDS("friends"),
    MESSAGES("messages"),
    PHOTOS("photos"),
    VIDEOS("videos"),
    NOTES("notes"),
    GIFTS("gifts"),
    EVENTS("events"),
    GROUPS("groups"),
    SDK("sdk"),
    FRIENDS_SUGGESTIONS("friends_suggestions")
}
