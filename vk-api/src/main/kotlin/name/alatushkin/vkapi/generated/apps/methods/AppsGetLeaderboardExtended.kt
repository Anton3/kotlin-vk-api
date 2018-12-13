@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.apps.objects.GetLeaderboardExtendedResponse
import name.alatushkin.vkapi.generated.apps.objects.GetLeaderboardType
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/apps.getLeaderboard]
 *
 * Returns players rating in the game.
 *
 * @property type Leaderboard type. Possible values: *'level' — by level,, *'points' — by mission points,, *'score' — by score ().
 * @property global Rating type. Possible values: *'1' — global rating among all players,, *'0' — rating among user friends.
 */
data class AppsGetLeaderboardExtended(
    var type: GetLeaderboardType,
    var global: Boolean? = null
) : VkMethod<GetLeaderboardExtendedResponse>(
    "apps.getLeaderboard",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
