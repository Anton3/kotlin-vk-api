package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Country
import name.alatushkin.vkapi.generated.common.objects.Object
import name.alatushkin.vkapi.generated.newsfeed.objects.GetSuggestedSourcesResponse
import name.alatushkin.vkapi.generated.users.objects.GetSubscriptionsExtendedResponse

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
    val membersCount: Long? = null,
    val counters: CountersGroup? = null,
    val cover: Cover? = null,
    val canPost: BoolInt? = null,
    val canSeeAllPosts: BoolInt? = null,
    val activity: String? = null,
    val fixedPost: Long? = null,
    val canCreateTopic: BoolInt? = null,
    val canUploadVideo: BoolInt? = null,
    val hasPhoto: BoolInt? = null,
    val status: String? = null,
    val mainAlbumId: Long? = null,
    val links: List<LinksItem>? = null,
    val contacts: List<ContactsItem>? = null,
    val site: String? = null,
    val mainSection: GroupFullMainSection? = null,
    val trending: BoolInt? = null,
    val canMessage: BoolInt? = null,
    val isMessagesBlocked: BoolInt? = null,
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
    override val isAdmin: BoolInt? = null,
    override val adminLevel: GroupAdminLevel? = null,
    override val isMember: BoolInt? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val photo200: String? = null
) : Group,
    GetSubscriptionsExtendedResponse,
    GetSuggestedSourcesResponse
