package name.anton3.vkapi.generated.friends.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.audio.objects.AudioFull
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
 * @property hasPhoto Information whether the user has main photo
 * @property trending Information whether the community has a "fire" pictogram.
 * @property hasMobile Information whether the user specified his phone number
 * @property isFriend Information whether the user is a friend of current user
 * @property friendStatus Friend status for current user
 * @property wallComments Information whether current user can comment wall posts
 * @property canPost Information whether current user can post on the user's wall
 * @property canSeeAllPosts Information whether current user can see other users' audio on the wall
 * @property canSeeAudio Information whether current user can see the user's audio
 * @property canWritePrivateMessage Information whether current user can write private message
 * @property canSendFriendRequest Information whether current user can send a friend request
 * @property mobilePhone Information whether current user can see
 * @property homePhone User's mobile phone number
 * @property skype User's Skype nickname
 * @property facebook User's Facebook account
 * @property facebookName User's Facebook name
 * @property twitter User's Twitter account
 * @property livejournal User's Livejournal account
 * @property instagram User's Instagram account
 * @property site User's website
 * @property statusAudio No description
 * @property status User's status
 * @property activity User's status
 * @property lastSeen No description
 * @property exports No description
 * @property cropPhoto No description
 * @property verified Information whether the user is verified
 * @property followersCount Number of user's followers
 * @property blacklisted Information whether current user is in the requested user's blacklist.
 * @property blacklistedByMe Information whether the requested user is in current user's blacklist
 * @property isFavorite Information whether the requested user is in faves of current user
 * @property isHiddenFromFeed Information whether the requested user is hidden from current user's newsfeed
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
 * @property relation User relationship status
 * @property relationPartner No description
 * @property personal No description
 * @property interests User's interests
 * @property music User's favorite music
 * @property activities User's activities
 * @property movies User's favorite movies
 * @property tv User's favorite tv shows
 * @property books User's favorite books
 * @property games User's favorite games
 * @property universities No description
 * @property schools No description
 * @property about About me field
 * @property relatives No description
 * @property quotes Favorite quotes
 * @property sex User sex
 * @property screenName Domain name of the user's page
 * @property photo50 URL of square photo of the user with 50 pixels in width
 * @property photo100 URL of square photo of the user with 100 pixels in width
 * @property online Information whether the user is online
 * @property onlineMobile Information whether the user is online in mobile site or application
 * @property onlineApp Application ID
 * @property id User ID
 * @property firstName User first name
 * @property lastName User last name
 * @property deactivated Returns if a profile is deleted or blocked
 * @property hidden Returns if a profile is hidden.
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
    override val photo200: String? = null,
    override val photoMax: String? = null,
    override val photo200Orig: String? = null,
    override val photo400Orig: String? = null,
    override val photoMaxOrig: String? = null,
    override val photoId: String? = null,
    override val hasPhoto: BoolInt? = null,
    override val trending: BoolInt? = null,
    override val hasMobile: BoolInt? = null,
    override val isFriend: BoolInt? = null,
    override val friendStatus: Int? = null,
    override val wallComments: BoolInt? = null,
    override val canPost: BoolInt? = null,
    override val canSeeAllPosts: BoolInt? = null,
    override val canSeeAudio: BoolInt? = null,
    override val canWritePrivateMessage: BoolInt? = null,
    override val canSendFriendRequest: BoolInt? = null,
    override val mobilePhone: String? = null,
    override val homePhone: String? = null,
    override val skype: String? = null,
    override val facebook: String? = null,
    override val facebookName: String? = null,
    override val twitter: String? = null,
    override val livejournal: String? = null,
    override val instagram: String? = null,
    override val site: String? = null,
    override val statusAudio: AudioFull? = null,
    override val status: String? = null,
    override val activity: String? = null,
    override val lastSeen: LastSeen? = null,
    override val exports: Exports? = null,
    override val cropPhoto: CropPhoto? = null,
    override val verified: BoolInt? = null,
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
    override val relation: Int? = null,
    override val relationPartner: UserMin? = null,
    override val personal: Personal? = null,
    override val interests: String? = null,
    override val music: String? = null,
    override val activities: String? = null,
    override val movies: String? = null,
    override val tv: String? = null,
    override val books: String? = null,
    override val games: String? = null,
    override val universities: List<University>? = null,
    override val schools: List<School>? = null,
    override val about: String? = null,
    override val relatives: List<Relative>? = null,
    override val quotes: String? = null,
    override val sex: Sex? = null,
    override val screenName: String? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val online: BoolInt? = null,
    override val onlineMobile: BoolInt? = null,
    override val onlineApp: Int? = null,
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Int? = null
) : UserFull
