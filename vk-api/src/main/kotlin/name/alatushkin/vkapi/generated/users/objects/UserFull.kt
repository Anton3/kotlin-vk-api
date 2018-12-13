package name.alatushkin.vkapi.generated.users.objects

import name.alatushkin.vkapi.generated.audio.objects.AudioFull
import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Country
import name.alatushkin.vkapi.generated.common.objects.Object
import name.alatushkin.vkapi.generated.common.objects.Sex
import name.alatushkin.vkapi.vktypes.VkBirthDate

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
    val hasPhoto: BoolInt?
    val trending: BoolInt?
    val hasMobile: BoolInt?
    val isFriend: BoolInt?
    val friendStatus: Long?
    val wallComments: BoolInt?
    val canPost: BoolInt?
    val canSeeAllPosts: BoolInt?
    val canSeeAudio: BoolInt?
    val canWritePrivateMessage: BoolInt?
    val canSendFriendRequest: BoolInt?
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
    val verified: BoolInt?
    val followersCount: Long?
    val blacklisted: BoolInt?
    val blacklistedByMe: BoolInt?
    val isFavorite: BoolInt?
    val isHiddenFromFeed: BoolInt?
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
    override val online: BoolInt?
    override val onlineMobile: BoolInt?
    override val onlineApp: Long?
    override val id: Long
    override val firstName: String
    override val lastName: String
    override val deactivated: String?
    override val hidden: Long?
}
