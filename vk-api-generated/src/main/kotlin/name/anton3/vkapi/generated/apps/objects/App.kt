@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.photos.objects.Photo

/**
 * No description
 *
 * @property authorGroup Official community's ID
 * @property authorUrl Application author's URL
 * @property banner1120 URL of the app banner with 1120 px in width
 * @property banner560 URL of the app banner with 560 px in width
 * @property friends No description
 * @property catalogPosition Catalog position
 * @property description Application description
 * @property genre Genre name
 * @property genreId Genre ID
 * @property international Information whether the application is multilanguage
 * @property isInCatalog Information whether application is in mobile catalog
 * @property leaderboardType No description
 * @property membersCount Members number
 * @property platformId Application ID in store
 * @property publishedDate Date when the application has been published in Unixtime
 * @property screenName Screen name
 * @property screenshots No description
 * @property section Application section name
 * @property type No description
 * @property id Application ID
 * @property title Application title
 * @property authorId Application author's ID
 * @property icon139 URL of the app icon with 139 px in width
 * @property icon150 URL of the app icon with 150 px in width
 * @property icon278 URL of the app icon with 278 px in width
 * @property icon75 URL of the app icon with 75 px in width
 */
@JsonDeserialize(`as` = Void::class)
data class App(
    val authorGroup: Int? = null,
    val authorUrl: String? = null,
    @get:JsonProperty("banner_1120") val banner1120: String? = null,
    @get:JsonProperty("banner_560") val banner560: String? = null,
    val friends: List<Int>? = null,
    val catalogPosition: Int? = null,
    val description: String? = null,
    val genre: String? = null,
    val genreId: Int? = null,
    val international: Int? = null,
    val isInCatalog: Int? = null,
    val leaderboardType: AppLeaderboardType? = null,
    val membersCount: Int? = null,
    val platformId: Int? = null,
    val publishedDate: Int? = null,
    val screenName: String? = null,
    val screenshots: List<Photo>? = null,
    val section: String? = null,
    override val type: AppType,
    override val id: Int,
    override val title: String,
    override val authorId: Int? = null,
    @get:JsonProperty("icon_139") override val icon139: String? = null,
    @get:JsonProperty("icon_150") override val icon150: String? = null,
    @get:JsonProperty("icon_278") override val icon278: String? = null,
    @get:JsonProperty("icon_75") override val icon75: String? = null
) : AppMin
