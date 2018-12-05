@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.apps.GetLeaderboardExtendedResponse
import name.alatushkin.api.vk.generated.apps.GetLeaderboardType
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
    object : TypeReference<VkResponse<GetLeaderboardExtendedResponse>>() {}
), UserMethod {

    var type: GetLeaderboardType by props
    var global: Boolean? by props

    init {
        this.type = type
        this.global = global
    }

    fun setType(type: GetLeaderboardType): AppsGetLeaderboardMethodExtended {
        this.type = type
        return this
    }

    fun setGlobal(global: Boolean): AppsGetLeaderboardMethodExtended {
        this.global = global
        return this
    }
}
