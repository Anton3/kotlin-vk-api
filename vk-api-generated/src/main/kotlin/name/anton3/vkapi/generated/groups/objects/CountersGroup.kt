@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

/**
 * No description
 *
 * @property photos Photos number
 * @property albums Photo albums number
 * @property topics Topics number
 * @property videos Videos number
 * @property audios Audios number
 * @property docs Docs number
 * @property market Market items number
 */
data class CountersGroup(
    val photos: Int? = null,
    val albums: Int? = null,
    val topics: Int? = null,
    val videos: Int? = null,
    val audios: Int? = null,
    val docs: Int? = null,
    val market: Int? = null
)
