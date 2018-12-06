@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.apps.GetLeaderboardExtendedResponse
import name.alatushkin.api.vk.generated.apps.GetLeaderboardType
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.getLeaderboard]
 *
 * Returns players rating in the game.
 *
 * @property type Leaderboard type. Possible values: *'level' — by level,, *'points' — by mission points,, *'score' — by score ().
 * @property global Rating type. Possible values: *'1' — global rating among all players,, *'0' — rating among user friends.
 */
class AppsGetLeaderboardMethodExtended(
    type: GetLeaderboardType,
    global: Boolean? = null
) : VkMethod<GetLeaderboardExtendedResponse>(
    "apps.getLeaderboard",
    mutableMapOf("extended" to "1"),
    successReference()
), UserMethod {

    var type: GetLeaderboardType by props
    var global: Boolean? by props

    init {
        this.type = type
        this.global = global
    }
}
