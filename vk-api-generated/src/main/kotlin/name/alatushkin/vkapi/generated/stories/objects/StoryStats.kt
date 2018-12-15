package name.alatushkin.vkapi.generated.stories.objects

/**
 * No description
 *
 * @property views No description
 * @property replies No description
 * @property answer No description
 * @property shares No description
 * @property subscribers No description
 * @property bans No description
 * @property openLink No description
 */
data class StoryStats(
    val views: StoryStatsStat,
    val replies: StoryStatsStat,
    val answer: StoryStatsStat,
    val shares: StoryStatsStat,
    val subscribers: StoryStatsStat,
    val bans: StoryStatsStat,
    val openLink: StoryStatsStat
)
