package name.alatushkin.api.vk.generated.friends.objects

import name.alatushkin.api.vk.generated.audio.objects.AudioFull
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.Country
import name.alatushkin.api.vk.generated.common.objects.Object
import name.alatushkin.api.vk.generated.common.objects.Sex
import name.alatushkin.api.vk.generated.users.objects.Career
import name.alatushkin.api.vk.generated.users.objects.CropPhoto
import name.alatushkin.api.vk.generated.users.objects.Exports
import name.alatushkin.api.vk.generated.users.objects.LastSeen
import name.alatushkin.api.vk.generated.users.objects.Military
import name.alatushkin.api.vk.generated.users.objects.Occupation
import name.alatushkin.api.vk.generated.users.objects.Personal
import name.alatushkin.api.vk.generated.users.objects.Relative
import name.alatushkin.api.vk.generated.users.objects.School
import name.alatushkin.api.vk.generated.users.objects.University
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.generated.users.objects.UserMin
import name.alatushkin.api.vk.vktypes.VkBirthDate

data class UserXtrPhone(
    val phone: String? = null,
    override val nickname: String? = null,
    override val maidenName: String? = null,
    override val domain: String? = null,
    override val bdate: VkBirthDate? = null,
    override val city: Object? = null,
    override val country: Country? = null,
    override val timezone: Long? = null,
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
    override val friendStatus: Long? = null,
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
    override val followersCount: Long? = null,
    override val blacklisted: BoolInt? = null,
    override val blacklistedByMe: BoolInt? = null,
    override val isFavorite: BoolInt? = null,
    override val isHiddenFromFeed: BoolInt? = null,
    override val commonCount: Long? = null,
    override val occupation: Occupation? = null,
    override val career: List<Career>? = null,
    override val military: List<Military>? = null,
    override val university: Long? = null,
    override val universityName: String? = null,
    override val faculty: Long? = null,
    override val facultyName: String? = null,
    override val graduation: Long? = null,
    override val educationForm: String? = null,
    override val educationStatus: String? = null,
    override val homeTown: String? = null,
    override val relation: Long? = null,
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
    override val onlineApp: Long? = null,
    override val id: Long,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Long? = null
) : UserFull
