@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.generated.common.objects.Sex
import name.anton3.vkapi.generated.friends.objects.FriendStatusStatus
import name.anton3.vkapi.generated.friends.objects.RequestsMutual
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkBirthDate

/**
 * No description
 *
 * @property nickname User nickname
 * @property maidenName User maiden name
 * @property domain Domain name of the user's page
 * @property bdate User's date of birth
 * @property city No description
 * @property country No description
 * @property timezone User's timezone
 * @property photo200 URL of square photo of the user with 200 pixels in width
 * @property photoMax URL of square photo of the user with maximum width
 * @property photo200Orig URL of user's photo with 200 pixels in width
 * @property photo400Orig URL of user's photo with 400 pixels in width
 * @property photoMaxOrig URL of user's photo of maximum size
 * @property photoId ID of the user's main photo
 * @property hasPhoto No description
 * @property hasMobile No description
 * @property isFriend No description
 * @property wallComments No description
 * @property canPost No description
 * @property canSeeAllPosts No description
 * @property canSeeAudio No description
 * @property canWritePrivateMessage No description
 * @property canSendFriendRequest No description
 * @property mobilePhone Information whether current user can see
 * @property homePhone User's mobile phone number
 * @property site User's website
 * @property statusAudio No description
 * @property status User's status
 * @property activity User's status
 * @property lastSeen No description
 * @property exports No description
 * @property cropPhoto No description
 * @property followersCount Number of user's followers
 * @property blacklisted No description
 * @property blacklistedByMe No description
 * @property isFavorite No description
 * @property isHiddenFromFeed No description
 * @property commonCount Number of common friends with current user
 * @property occupation No description
 * @property career No description
 * @property military No description
 * @property university University ID
 * @property universityName University name
 * @property faculty Faculty ID
 * @property facultyName Faculty name
 * @property graduation Graduation year
 * @property educationForm Education form
 * @property educationStatus User's education status
 * @property homeTown User hometown
 * @property relation No description
 * @property relationPartner No description
 * @property personal No description
 * @property universities No description
 * @property schools No description
 * @property relatives No description
 * @property isSubscribedPodcasts Information whether current user is subscribed to podcasts
 * @property canSubscribePodcasts Owner in whitelist or not
 * @property canSubscribePosts Can subscribe to wall
 * @property sex No description
 * @property screenName Domain name of the user's page
 * @property photo50 URL of square photo of the user with 50 pixels in width
 * @property photo100 URL of square photo of the user with 100 pixels in width
 * @property online No description
 * @property onlineMobile No description
 * @property onlineApp Application ID
 * @property verified No description
 * @property trending No description
 * @property friendStatus No description
 * @property mutual No description
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property isClosed No description
 * @property canAccessClosed No description
 */
@JsonDeserialize(`as` = UserFullImpl::class)
interface UserFull : User {
    val nickname: String?
    val maidenName: String?
    val domain: String?
    val bdate: VkBirthDate?
    val city: Object?
    val country: Country?
    val timezone: Int?
    @get:JsonProperty("photo_200") val photo200: String?
    val photoMax: String?
    @get:JsonProperty("photo_200_orig") val photo200Orig: String?
    @get:JsonProperty("photo_400_orig") val photo400Orig: String?
    val photoMaxOrig: String?
    val photoId: String?
    val hasPhoto: BoolInt?
    val hasMobile: BoolInt?
    val isFriend: BoolInt?
    val wallComments: BoolInt?
    val canPost: BoolInt?
    val canSeeAllPosts: BoolInt?
    val canSeeAudio: BoolInt?
    val canWritePrivateMessage: BoolInt?
    val canSendFriendRequest: BoolInt?
    val mobilePhone: String?
    val homePhone: String?
    val site: String?
    val statusAudio: Audio?
    val status: String?
    val activity: String?
    val lastSeen: LastSeen?
    val exports: Exports?
    val cropPhoto: CropPhoto?
    val followersCount: Int?
    val blacklisted: BoolInt?
    val blacklistedByMe: BoolInt?
    val isFavorite: BoolInt?
    val isHiddenFromFeed: BoolInt?
    val commonCount: Int?
    val occupation: Occupation?
    val career: List<Career>?
    val military: List<Military>?
    val university: Int?
    val universityName: String?
    val faculty: Int?
    val facultyName: String?
    val graduation: Int?
    val educationForm: String?
    val educationStatus: String?
    val homeTown: String?
    val relation: UserRelation?
    val relationPartner: UserMin?
    val personal: Personal?
    val universities: List<University>?
    val schools: List<School>?
    val relatives: List<Relative>?
    val isSubscribedPodcasts: Boolean?
    val canSubscribePodcasts: Boolean?
    val canSubscribePosts: Boolean?
    override val sex: Sex?
    override val screenName: String?
    @get:JsonProperty("photo_50") override val photo50: String?
    @get:JsonProperty("photo_100") override val photo100: String?
    override val online: BoolInt?
    override val onlineMobile: BoolInt?
    override val onlineApp: Int?
    override val verified: BoolInt?
    override val trending: BoolInt?
    override val friendStatus: FriendStatusStatus?
    override val mutual: RequestsMutual?
    override val id: Int
    override val firstName: String
    override val lastName: String
    override val deactivated: UserMinDeactivated?
    override val isClosed: BoolInt
    override val canAccessClosed: BoolInt?
}
