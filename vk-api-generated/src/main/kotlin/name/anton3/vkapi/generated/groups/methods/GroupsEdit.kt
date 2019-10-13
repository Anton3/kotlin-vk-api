@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.GroupAccess
import name.anton3.vkapi.generated.groups.objects.GroupAgeLimits
import name.anton3.vkapi.generated.groups.objects.GroupAudio
import name.anton3.vkapi.generated.groups.objects.GroupDocs
import name.anton3.vkapi.generated.groups.objects.GroupMarketCurrency
import name.anton3.vkapi.generated.groups.objects.GroupPhotos
import name.anton3.vkapi.generated.groups.objects.GroupSubject
import name.anton3.vkapi.generated.groups.objects.GroupTopics
import name.anton3.vkapi.generated.groups.objects.GroupVideo
import name.anton3.vkapi.generated.groups.objects.GroupWall
import name.anton3.vkapi.generated.groups.objects.GroupWiki
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.edit]
 *
 * Edits a community.
 *
 * @property groupId Community ID.
 * @property title Community title.
 * @property description Community description.
 * @property screenName Community screen name.
 * @property access No description
 * @property website Website that will be displayed in the community information field.
 * @property subject No description
 * @property email Organizer email (for events).
 * @property phone Organizer phone number (for events).
 * @property rss RSS feed address for import (available only to communities with special permission. Contact vk.com/support to get it.
 * @property eventStartDate Event start date in Unixtime format.
 * @property eventFinishDate Event finish date in Unixtime format.
 * @property eventGroupId Organizer community ID (for events only).
 * @property publicCategory Public page category ID.
 * @property publicSubcategory Public page subcategory ID.
 * @property publicDate Founding date of a company or organization owning the community in "dd.mm.YYYY" format.
 * @property wall No description
 * @property topics No description
 * @property photos No description
 * @property video No description
 * @property audio No description
 * @property links Links settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property events Events settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property places Places settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property contacts Contacts settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property docs No description
 * @property wiki No description
 * @property messages Community messages. Possible values: *'0' — disabled,, *'1' — enabled.
 * @property articles No description
 * @property addresses No description
 * @property ageLimits No description
 * @property market Market settings. Possible values: *'0' – disabled,, *'1' – enabled.
 * @property marketComments market comments settings. Possible values: *'0' – disabled,, *'1' – enabled.
 * @property marketCountry Market delivery countries.
 * @property marketCity Market delivery cities (if only one country is specified).
 * @property marketCurrency No description
 * @property marketContact Seller contact for market. Set '0' for community messages.
 * @property marketWiki ID of a wiki page with market description.
 * @property obsceneFilter Obscene expressions filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
 * @property obsceneStopwords Stopwords filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
 * @property obsceneWords Keywords for stopwords filter.
 * @property mainSection No description
 * @property secondarySection No description
 * @property country Country of the community.
 * @property city City of the community.
 */
data class GroupsEdit(
    var groupId: Int,
    var title: String? = null,
    var description: String? = null,
    var screenName: String? = null,
    var access: GroupAccess? = null,
    var website: String? = null,
    var subject: GroupSubject? = null,
    var email: String? = null,
    var phone: String? = null,
    var rss: String? = null,
    var eventStartDate: Int? = null,
    var eventFinishDate: Int? = null,
    var eventGroupId: Int? = null,
    var publicCategory: Int? = null,
    var publicSubcategory: Int? = null,
    var publicDate: String? = null,
    var wall: GroupWall? = null,
    var topics: GroupTopics? = null,
    var photos: GroupPhotos? = null,
    var video: GroupVideo? = null,
    var audio: GroupAudio? = null,
    var links: Boolean? = null,
    var events: Boolean? = null,
    var places: Boolean? = null,
    var contacts: Boolean? = null,
    var docs: GroupDocs? = null,
    var wiki: GroupWiki? = null,
    var messages: Boolean? = null,
    var articles: Boolean? = null,
    var addresses: Boolean? = null,
    var ageLimits: GroupAgeLimits? = null,
    var market: Boolean? = null,
    var marketComments: Boolean? = null,
    var marketCountry: List<Int>? = null,
    var marketCity: List<Int>? = null,
    var marketCurrency: GroupMarketCurrency? = null,
    var marketContact: Int? = null,
    var marketWiki: Int? = null,
    var obsceneFilter: Boolean? = null,
    var obsceneStopwords: Boolean? = null,
    var obsceneWords: List<String>? = null,
    var mainSection: Int? = null,
    var secondarySection: Int? = null,
    var country: Int? = null,
    var city: Int? = null
) : VkMethod<OkResponse, UserMethod>("groups.edit", jacksonTypeRef())
