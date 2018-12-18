package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.generated.newsfeed.objects.GetSuggestedSourcesResponse
import name.anton3.vkapi.generated.users.objects.GetSubscriptionsExtendedResponse

/**
 * No description
 *
 * @property market No description
 * @property memberStatus Current user's member status
 * @property isFavorite Information whether community is in faves
 * @property isSubscribed Information whether current user is subscribed
 * @property city No description
 * @property country No description
 * @property verified Information whether community is verified
 * @property description Community description
 * @property wikiPage Community's main wiki page title
 * @property membersCount Community members number
 * @property counters No description
 * @property cover No description
 * @property canPost Information whether current user can post on community's wall
 * @property canSeeAllPosts Information whether current user can see all posts on community's wall
 * @property activity Type of group, start date of event or category of public page
 * @property fixedPost Fixed post ID
 * @property canCreateTopic Information whether current user can create topic
 * @property canUploadVideo Information whether current user can upload video
 * @property hasPhoto Information whether community has photo
 * @property status Community status
 * @property mainAlbumId Community's main photo album ID
 * @property links No description
 * @property contacts No description
 * @property site Community's website
 * @property mainSection No description
 * @property trending Information whether the community has a "fire" pictogram.
 * @property canMessage Information whether current user can send a message to community
 * @property isMessagesBlocked Information whether community can send a message to current user
 * @property onlineStatus Status of replies in community messages
 * @property startDate Start date of event in Unixtime
 * @property finishDate Finish date of event in Unixtime
 * @property ageLimits Information whether age limit
 * @property banInfo User ban info
 * @property id Community ID
 * @property name Community name
 * @property screenName Domain of the community page
 * @property deactivated Information whether community is banned
 * @property isClosed No description
 * @property type No description
 * @property isAdmin Information whether current user is administrator
 * @property adminLevel No description
 * @property isMember Information whether current user is member
 * @property photo50 URL of square photo of the community with 50 pixels in width
 * @property photo100 URL of square photo of the community with 100 pixels in width
 * @property photo200 URL of square photo of the community with 200 pixels in width
 */
data class GroupFull(
    val market: MarketInfo? = null,
    val memberStatus: GroupFullMemberStatus? = null,
    val isFavorite: Boolean? = null,
    val isSubscribed: Boolean? = null,
    val city: Object? = null,
    val country: Country? = null,
    val verified: Boolean? = null,
    val description: String? = null,
    val wikiPage: String? = null,
    val membersCount: Long? = null,
    val counters: CountersGroup? = null,
    val cover: Cover? = null,
    val canPost: Boolean? = null,
    val canSeeAllPosts: Boolean? = null,
    val activity: String? = null,
    val fixedPost: Long? = null,
    val canCreateTopic: Boolean? = null,
    val canUploadVideo: Boolean? = null,
    val hasPhoto: Boolean? = null,
    val status: String? = null,
    val mainAlbumId: Long? = null,
    val links: List<LinksItem>? = null,
    val contacts: List<ContactsItem>? = null,
    val site: String? = null,
    val mainSection: GroupFullMainSection? = null,
    val trending: Boolean? = null,
    val canMessage: Boolean? = null,
    val isMessagesBlocked: Boolean? = null,
    val onlineStatus: OnlineStatus? = null,
    val startDate: Long? = null,
    val finishDate: Long? = null,
    val ageLimits: GroupFullAgeLimits? = null,
    val banInfo: GroupBanInfo? = null,
    override val id: Long? = null,
    override val name: String? = null,
    override val screenName: String? = null,
    override val deactivated: String? = null,
    override val isClosed: Visibility? = null,
    override val type: Type? = null,
    override val isAdmin: Boolean? = null,
    override val adminLevel: GroupAdminLevel? = null,
    override val isMember: Boolean? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val photo200: String? = null
) : Group,
    GetSubscriptionsExtendedResponse,
    GetSuggestedSourcesResponse
