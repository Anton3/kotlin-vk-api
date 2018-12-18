@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.users.objects.SearchSex
import name.anton3.vkapi.generated.users.objects.SearchSort
import name.anton3.vkapi.generated.users.objects.SearchStatus
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/users.search]
 *
 * Returns a list of users matching the search criteria.
 *
 * @property q Search query string (e.g., 'Vasya Babich').
 * @property sort Sort order: '1' — by date registered, '0' — by rating
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online',
 * @property city City ID.
 * @property country Country ID.
 * @property hometown City name in a string.
 * @property universityCountry ID of the country where the user graduated.
 * @property university ID of the institution of higher education.
 * @property universityYear Year of graduation from an institution of higher education.
 * @property universityFaculty Faculty ID.
 * @property universityChair Chair ID.
 * @property sex '1' — female, '2' — male, '0' — any (default)
 * @property status Relationship status: '1' — Not married, '2' — In a relationship, '3' — Engaged, '4' — Married, '5' — It's complicated, '6' — Actively searching, '7' — In love
 * @property ageFrom Minimum age.
 * @property ageTo Maximum age.
 * @property birthDay Day of birth.
 * @property birthMonth Month of birth.
 * @property birthYear Year of birth.
 * @property online '1' — online only, '0' — all users
 * @property hasPhoto '1' — with photo only, '0' — all users
 * @property schoolCountry ID of the country where users finished school.
 * @property schoolCity ID of the city where users finished school.
 * @property schoolClass No description
 * @property school ID of the school.
 * @property schoolYear School graduation year.
 * @property religion Users' religious affiliation.
 * @property interests Users' interests.
 * @property company Name of the company where users work.
 * @property position Job position.
 * @property groupId ID of a community to search in communities.
 * @property fromList No description
 */
data class UsersSearch(
    var q: String? = null,
    var sort: SearchSort? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var fields: List<String>? = null,
    var city: Long? = null,
    var country: Long? = null,
    var hometown: String? = null,
    var universityCountry: Long? = null,
    var university: Long? = null,
    var universityYear: Long? = null,
    var universityFaculty: Long? = null,
    var universityChair: Long? = null,
    var sex: SearchSex? = null,
    var status: SearchStatus? = null,
    var ageFrom: Long? = null,
    var ageTo: Long? = null,
    var birthDay: Long? = null,
    var birthMonth: Long? = null,
    var birthYear: Long? = null,
    var online: Boolean? = null,
    var hasPhoto: Boolean? = null,
    var schoolCountry: Long? = null,
    var schoolCity: Long? = null,
    var schoolClass: Long? = null,
    var school: Long? = null,
    var schoolYear: Long? = null,
    var religion: String? = null,
    var interests: String? = null,
    var company: String? = null,
    var position: String? = null,
    var groupId: Long? = null,
    var fromList: List<String>? = null
) : VkMethod<VkList<UserFull>>("users.search", jacksonTypeRef()),
    UserMethod
