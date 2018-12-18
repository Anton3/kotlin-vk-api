package name.anton3.vkapi.generated.users.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.audio.objects.AudioFull
import name.anton3.vkapi.generated.common.objects.Country
import name.anton3.vkapi.generated.common.objects.Object
import name.anton3.vkapi.generated.common.objects.Sex
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
@JsonDeserialize(`as` = UserFullImpl::class)
interface UserFull : User {

    val nickname: String?
    val maidenName: String?
    val domain: String?
    val bdate: VkBirthDate?
    val city: Object?
    val country: Country?
    val timezone: Long?
    val photo200: String?
    val photoMax: String?
    val photo200Orig: String?
    val photo400Orig: String?
    val photoMaxOrig: String?
    val photoId: String?
    val hasPhoto: Boolean?
    val trending: Boolean?
    val hasMobile: Boolean?
    val isFriend: Boolean?
    val friendStatus: Long?
    val wallComments: Boolean?
    val canPost: Boolean?
    val canSeeAllPosts: Boolean?
    val canSeeAudio: Boolean?
    val canWritePrivateMessage: Boolean?
    val canSendFriendRequest: Boolean?
    val mobilePhone: String?
    val homePhone: String?
    val skype: String?
    val facebook: String?
    val facebookName: String?
    val twitter: String?
    val livejournal: String?
    val instagram: String?
    val site: String?
    val statusAudio: AudioFull?
    val status: String?
    val activity: String?
    val lastSeen: LastSeen?
    val exports: Exports?
    val cropPhoto: CropPhoto?
    val verified: Boolean?
    val followersCount: Long?
    val blacklisted: Boolean?
    val blacklistedByMe: Boolean?
    val isFavorite: Boolean?
    val isHiddenFromFeed: Boolean?
    val commonCount: Long?
    val occupation: Occupation?
    val career: List<Career>?
    val military: List<Military>?
    val university: Long?
    val universityName: String?
    val faculty: Long?
    val facultyName: String?
    val graduation: Long?
    val educationForm: String?
    val educationStatus: String?
    val homeTown: String?
    val relation: Long?
    val relationPartner: UserMin?
    val personal: Personal?
    val interests: String?
    val music: String?
    val activities: String?
    val movies: String?
    val tv: String?
    val books: String?
    val games: String?
    val universities: List<University>?
    val schools: List<School>?
    val about: String?
    val relatives: List<Relative>?
    val quotes: String?
    override val sex: Sex?
    override val screenName: String?
    override val photo50: String?
    override val photo100: String?
    override val online: Boolean?
    override val onlineMobile: Boolean?
    override val onlineApp: Long?
    override val id: Long
    override val firstName: String
    override val lastName: String
    override val deactivated: String?
    override val hidden: Long?
}
