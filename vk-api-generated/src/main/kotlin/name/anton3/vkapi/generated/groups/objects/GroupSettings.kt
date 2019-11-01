@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property access Community access settings
 * @property address Community's page domain
 * @property audio Audio settings
 * @property description Community description
 * @property docs Docs settings
 * @property obsceneFilter Information whether the obscene filter is enabled
 * @property obsceneStopwords Information whether the stopwords filter is enabled
 * @property obsceneWords The list of stop words
 * @property photos Photos settings
 * @property publicCategory Information about the group category
 * @property publicCategoryList No description
 * @property publicSubcategory Information about the group subcategory
 * @property rss URL of the RSS feed
 * @property subject Community subject ID
 * @property subjectList No description
 * @property title Community title
 * @property topics Topics settings
 * @property video Video settings
 * @property wall Wall settings
 * @property website Community website
 * @property wiki Wiki settings
 */
data class GroupSettings(
    val access: Int? = null,
    val address: String? = null,
    val audio: Int? = null,
    val description: String? = null,
    val docs: Int? = null,
    val obsceneFilter: BoolInt? = null,
    val obsceneStopwords: BoolInt? = null,
    val obsceneWords: String? = null,
    val photos: Int? = null,
    val publicCategory: Int? = null,
    val publicCategoryList: List<GroupPublicCategoryList>? = null,
    val publicSubcategory: Int? = null,
    val rss: String? = null,
    val subject: Int? = null,
    val subjectList: List<SubjectItem>? = null,
    val title: String? = null,
    val topics: Int? = null,
    val video: Int? = null,
    val wall: Int? = null,
    val website: String? = null,
    val wiki: Int? = null
)
