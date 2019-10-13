@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.PropertyExists

/**
 * No description
 *
 * @property ageFrom Age from
 * @property ageTo Age to
 * @property apps Apps IDs
 * @property appsNot Apps IDs to except
 * @property birthday Days to birthday
 * @property cities Cities IDs
 * @property citiesNot Cities IDs to except
 * @property country Country ID
 * @property districts Districts IDs
 * @property groups Communities IDs
 * @property interestCategories Interests categories IDs
 * @property interests Interests
 * @property paying No description
 * @property positions Positions IDs
 * @property religions Religions IDs
 * @property retargetingGroups Retargeting groups IDs
 * @property retargetingGroupsNot Retargeting groups IDs to except
 * @property schoolFrom School graduation year from
 * @property schoolTo School graduation year to
 * @property schools Schools IDs
 * @property sex No description
 * @property stations Stations IDs
 * @property statuses Relationship statuses
 * @property streets Streets IDs
 * @property travellers No description
 * @property uniFrom University graduation year from
 * @property uniTo University graduation year to
 * @property userBrowsers Browsers
 * @property userDevices Devices
 * @property userOs Operating systems
 */
@JsonDeserialize(`as` = CriteriaImpl::class)
interface Criteria {
    val ageFrom: Int?
    val ageTo: Int?
    val apps: String?
    val appsNot: String?
    val birthday: Int?
    val cities: String?
    val citiesNot: String?
    val country: Int?
    val districts: String?
    val groups: String?
    val interestCategories: String?
    val interests: String?
    val paying: BoolInt?
    val positions: String?
    val religions: String?
    val retargetingGroups: String?
    val retargetingGroupsNot: String?
    val schoolFrom: Int?
    val schoolTo: Int?
    val schools: String?
    val sex: CriteriaSex?
    val stations: String?
    val statuses: String?
    val streets: String?
    val travellers: PropertyExists?
    val uniFrom: Int?
    val uniTo: Int?
    val userBrowsers: String?
    val userDevices: String?
    val userOs: String?
}
