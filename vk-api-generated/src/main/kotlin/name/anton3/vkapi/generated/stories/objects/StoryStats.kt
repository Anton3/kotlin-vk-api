@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

/**
 * No description
 *
 * @property answer No description
 * @property bans No description
 * @property openLink No description
 * @property replies No description
 * @property shares No description
 * @property subscribers No description
 * @property views No description
 */
data class StoryStats(
    val answer: StoryStatsStat,
    val bans: StoryStatsStat,
    val openLink: StoryStatsStat,
    val replies: StoryStatsStat,
    val shares: StoryStatsStat,
    val subscribers: StoryStatsStat,
    val views: StoryStatsStat
)
