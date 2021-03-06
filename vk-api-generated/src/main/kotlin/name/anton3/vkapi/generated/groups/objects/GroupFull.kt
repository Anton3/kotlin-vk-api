@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.generated.newsfeed.objects.GetSuggestedSourcesResponse
import name.anton3.vkapi.generated.users.objects.SubscriptionsItem
import name.anton3.vkapi.vktypes.BoolInt

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
 * @property canSendNotify Information whether community can send notifications by phone number to current user
 * @property onlineStatus Status of replies in community messages
 * @property ageLimits Information whether age limit
 * @property banInfo User ban info
 * @property addresses Info about addresses in groups
 * @property isSubscribedPodcasts Information whether current user is subscribed to podcasts
 * @property canSubscribePodcasts Owner in whitelist or not
 * @property canSubscribePosts Can subscribe to wall
 * @property adminLevel No description
 * @property deactivated Information whether community is banned
 * @property finishDate Finish date in Unixtime format
 * @property id Community ID
 * @property isAdmin Information whether current user is administrator
 * @property isAdvertiser Information whether current user is advertiser
 * @property isClosed No description
 * @property isMember Information whether current user is member
 * @property name Community name
 * @property photo100 URL of square photo of the community with 100 pixels in width
 * @property photo200 URL of square photo of the community with 200 pixels in width
 * @property photo50 URL of square photo of the community with 50 pixels in width
 * @property screenName Domain of the community page
 * @property startDate Start date in Unixtime format
 * @property type No description
 */
@JsonDeserialize(`as` = Void::class)
data class GroupFull(
    val market: MarketInfo? = null,
    val memberStatus: GroupFullMemberStatus? = null,
    val isFavorite: BoolInt? = null,
    val isSubscribed: BoolInt? = null,
    val city: Object? = null,
    val country: Country? = null,
    val verified: BoolInt? = null,
    val description: String? = null,
    val wikiPage: String? = null,
    val membersCount: Int? = null,
    val counters: CountersGroup? = null,
    val cover: Cover? = null,
    val canPost: BoolInt? = null,
    val canSeeAllPosts: BoolInt? = null,
    val activity: String? = null,
    val fixedPost: Int? = null,
    val canCreateTopic: BoolInt? = null,
    val canUploadVideo: BoolInt? = null,
    val hasPhoto: BoolInt? = null,
    val status: String? = null,
    val mainAlbumId: Int? = null,
    val links: List<LinksItem>? = null,
    val contacts: List<ContactsItem>? = null,
    val site: String? = null,
    val mainSection: GroupFullMainSection? = null,
    val trending: BoolInt? = null,
    val canMessage: BoolInt? = null,
    val isMessagesBlocked: BoolInt? = null,
    val canSendNotify: BoolInt? = null,
    val onlineStatus: OnlineStatus? = null,
    val ageLimits: GroupFullAgeLimits? = null,
    val banInfo: GroupBanInfo? = null,
    val addresses: AddressesInfo? = null,
    val isSubscribedPodcasts: Boolean? = null,
    val canSubscribePodcasts: Boolean? = null,
    val canSubscribePosts: Boolean? = null,
    override val adminLevel: GroupAdminLevel? = null,
    override val deactivated: String? = null,
    override val finishDate: Int? = null,
    override val id: Int? = null,
    override val isAdmin: BoolInt? = null,
    override val isAdvertiser: BoolInt? = null,
    override val isClosed: GroupAccess? = null,
    override val isMember: BoolInt? = null,
    override val name: String? = null,
    @get:JsonProperty("photo_100") override val photo100: String? = null,
    @get:JsonProperty("photo_200") override val photo200: String? = null,
    @get:JsonProperty("photo_50") override val photo50: String? = null,
    override val screenName: String? = null,
    override val startDate: Int? = null,
    override val type: GroupType? = null
) : Group, GetSuggestedSourcesResponse, SubscriptionsItem
