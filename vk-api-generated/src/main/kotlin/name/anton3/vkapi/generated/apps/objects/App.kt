package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.generated.photos.objects.Photo

/**
 * No description
 *
 * @property id Application ID
 * @property title Application title
 * @property screenName Screen name
 * @property description Application description
 * @property icon278 URL of the app icon with 279 px in width
 * @property icon150 URL of the app icon with 150 px in width
 * @property icon139 URL of the app icon with 139 px in width
 * @property icon75 URL of the app icon with 75 px in width
 * @property banner560 URL of the app banner with 560 px in width
 * @property banner1120 URL of the app banner with 1120 px in width
 * @property type No description
 * @property section Application section name
 * @property authorUrl Application author's URL
 * @property authorId Application author's ID
 * @property authorGroup Official community's ID
 * @property membersCount Members number
 * @property publishedDate Date when the application has been published in Unixtime
 * @property catalogPosition Catalog position
 * @property screenshots No description
 * @property international Information whether the application is multilanguage
 * @property leaderboardType No description
 * @property genreId Genre ID
 * @property genre Genre name
 * @property platformId Application ID in store
 * @property isInCatalog Information whether application is in mobile catalog
 */
data class App(
    val id: Long,
    val title: String,
    val screenName: String? = null,
    val description: String? = null,
    val icon278: String? = null,
    val icon150: String? = null,
    val icon139: String? = null,
    val icon75: String? = null,
    val banner560: String? = null,
    val banner1120: String? = null,
    val type: AppType,
    val section: String? = null,
    val authorUrl: String? = null,
    val authorId: Long? = null,
    val authorGroup: Long? = null,
    val membersCount: Long? = null,
    val publishedDate: Long? = null,
    val catalogPosition: Long? = null,
    val screenshots: List<Photo>? = null,
    val international: Long? = null,
    val leaderboardType: AppLeaderboardType? = null,
    val genreId: Long? = null,
    val genre: String? = null,
    val platformId: Long? = null,
    val isInCatalog: Long? = null
)
