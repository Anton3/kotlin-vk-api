@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.audio.objects.Audio
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.generated.common.objects.Sex
import name.anton3.vkapi.generated.users.objects.Career
import name.anton3.vkapi.generated.users.objects.CropPhoto
import name.anton3.vkapi.generated.users.objects.Exports
import name.anton3.vkapi.generated.users.objects.LastSeen
import name.anton3.vkapi.generated.users.objects.Military
import name.anton3.vkapi.generated.users.objects.Occupation
import name.anton3.vkapi.generated.users.objects.Personal
import name.anton3.vkapi.generated.users.objects.Relative
import name.anton3.vkapi.generated.users.objects.School
import name.anton3.vkapi.generated.users.objects.University
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.generated.users.objects.UserMinDeactivated
import name.anton3.vkapi.generated.users.objects.UserRelation
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkBirthDate

/**
 * No description
 *
 * @property lists No description
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
@JsonDeserialize(`as` = Void::class)
data class UserXtrLists(
    val lists: List<Int>? = null,
    override val nickname: String? = null,
    override val maidenName: String? = null,
    override val domain: String? = null,
    override val bdate: VkBirthDate? = null,
    override val city: Object? = null,
    override val country: Country? = null,
    override val timezone: Int? = null,
    @get:JsonProperty("photo_200") override val photo200: String? = null,
    override val photoMax: String? = null,
    @get:JsonProperty("photo_200_orig") override val photo200Orig: String? = null,
    @get:JsonProperty("photo_400_orig") override val photo400Orig: String? = null,
    override val photoMaxOrig: String? = null,
    override val photoId: String? = null,
    override val hasPhoto: BoolInt? = null,
    override val hasMobile: BoolInt? = null,
    override val isFriend: BoolInt? = null,
    override val wallComments: BoolInt? = null,
    override val canPost: BoolInt? = null,
    override val canSeeAllPosts: BoolInt? = null,
    override val canSeeAudio: BoolInt? = null,
    override val canWritePrivateMessage: BoolInt? = null,
    override val canSendFriendRequest: BoolInt? = null,
    override val mobilePhone: String? = null,
    override val homePhone: String? = null,
    override val site: String? = null,
    override val statusAudio: Audio? = null,
    override val status: String? = null,
    override val activity: String? = null,
    override val lastSeen: LastSeen? = null,
    override val exports: Exports? = null,
    override val cropPhoto: CropPhoto? = null,
    override val followersCount: Int? = null,
    override val blacklisted: BoolInt? = null,
    override val blacklistedByMe: BoolInt? = null,
    override val isFavorite: BoolInt? = null,
    override val isHiddenFromFeed: BoolInt? = null,
    override val commonCount: Int? = null,
    override val occupation: Occupation? = null,
    override val career: List<Career>? = null,
    override val military: List<Military>? = null,
    override val university: Int? = null,
    override val universityName: String? = null,
    override val faculty: Int? = null,
    override val facultyName: String? = null,
    override val graduation: Int? = null,
    override val educationForm: String? = null,
    override val educationStatus: String? = null,
    override val homeTown: String? = null,
    override val relation: UserRelation? = null,
    override val relationPartner: UserMin? = null,
    override val personal: Personal? = null,
    override val universities: List<University>? = null,
    override val schools: List<School>? = null,
    override val relatives: List<Relative>? = null,
    override val isSubscribedPodcasts: Boolean? = null,
    override val canSubscribePodcasts: Boolean? = null,
    override val canSubscribePosts: Boolean? = null,
    override val sex: Sex? = null,
    override val screenName: String? = null,
    @get:JsonProperty("photo_50") override val photo50: String? = null,
    @get:JsonProperty("photo_100") override val photo100: String? = null,
    override val online: BoolInt? = null,
    override val onlineMobile: BoolInt? = null,
    override val onlineApp: Int? = null,
    override val verified: BoolInt? = null,
    override val trending: BoolInt? = null,
    override val friendStatus: FriendStatusStatus? = null,
    override val mutual: RequestsMutual? = null,
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: UserMinDeactivated? = null,
    override val isClosed: BoolInt,
    override val canAccessClosed: BoolInt? = null
) : UserFull
