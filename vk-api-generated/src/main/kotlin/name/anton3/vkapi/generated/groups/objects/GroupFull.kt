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
 * @property memberStatus No description
 * @property isFavorite No description
 * @property isSubscribed No description
 * @property city No description
 * @property country No description
 * @property verified No description
 * @property description Community description
 * @property wikiPage Community's main wiki page title
 * @property membersCount Community members number
 * @property counters No description
 * @property cover No description
 * @property canPost No description
 * @property canSeeAllPosts No description
 * @property activity Type of group, start date of event or category of public page
 * @property fixedPost Fixed post ID
 * @property canCreateTopic No description
 * @property canUploadVideo No description
 * @property hasPhoto No description
 * @property status Community status
 * @property mainAlbumId Community's main photo album ID
 * @property links No description
 * @property contacts No description
 * @property site Community's website
 * @property mainSection No description
 * @property trending No description
 * @property canMessage No description
 * @property isMessagesBlocked No description
 * @property canSendNotify No description
 * @property onlineStatus No description
 * @property ageLimits No description
 * @property banInfo No description
 * @property addresses No description
 * @property isSubscribedPodcasts Information whether current user is subscribed to podcasts
 * @property canSubscribePodcasts Owner in whitelist or not
 * @property canSubscribePosts Can subscribe to wall
 * @property adminLevel No description
 * @property deactivated Information whether community is banned
 * @property finishDate Finish date in Unixtime format
 * @property id Community ID
 * @property isAdmin No description
 * @property isAdvertiser No description
 * @property isClosed No description
 * @property isMember No description
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
    override val isClosed: GroupIsClosed? = null,
    override val isMember: BoolInt? = null,
    override val name: String? = null,
    @get:JsonProperty("photo_100") override val photo100: String? = null,
    @get:JsonProperty("photo_200") override val photo200: String? = null,
    @get:JsonProperty("photo_50") override val photo50: String? = null,
    override val screenName: String? = null,
    override val startDate: Int? = null,
    override val type: Type? = null
) : Group, GetSuggestedSourcesResponse, SubscriptionsItem
