package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.places.objects.PlaceMin

/**
 * No description
 *
 * @property title Community title
 * @property description Community description
 * @property address Community's page domain
 * @property place No description
 * @property wall Wall settings
 * @property photos Photos settings
 * @property video Video settings
 * @property audio Audio settings
 * @property docs Docs settings
 * @property topics Topics settings
 * @property wiki Wiki settings
 * @property obsceneFilter Information whether the obscene filter is enabled
 * @property publicCategory Information about the group category
 * @property publicSubcategory Information about the group subcategory
 * @property publicCategoryList No description
 * @property obsceneStopwords Information whether the stopwords filter is enabled
 * @property obsceneWords The list of stop words
 * @property access Community access settings
 * @property subject Community subject ID
 * @property subjectList No description
 * @property rss URL of the RSS feed
 * @property website Community website
 */
data class GroupSettings(
    val title: String? = null,
    val description: String? = null,
    val address: String? = null,
    val place: PlaceMin? = null,
    val wall: Long? = null,
    val photos: Long? = null,
    val video: Long? = null,
    val audio: Long? = null,
    val docs: Long? = null,
    val topics: Long? = null,
    val wiki: Long? = null,
    val obsceneFilter: Boolean? = null,
    val publicCategory: Long? = null,
    val publicSubcategory: Long? = null,
    val publicCategoryList: List<GroupPublicCategoryList>? = null,
    val obsceneStopwords: Boolean? = null,
    val obsceneWords: String? = null,
    val access: Long? = null,
    val subject: Long? = null,
    val subjectList: List<SubjectItem>? = null,
    val rss: String? = null,
    val website: String? = null
)
