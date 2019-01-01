package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.PropertyExists

/**
 * No description
 *
 * @property sex No description
 * @property ageFrom Age from
 * @property ageTo Age to
 * @property birthday Days to birthday
 * @property country Country ID
 * @property cities Cities IDs
 * @property citiesNot Cities IDs to except
 * @property statuses Relationship statuses
 * @property groups Communities IDs
 * @property apps Apps IDs
 * @property appsNot Apps IDs to except
 * @property districts Districts IDs
 * @property stations Stations IDs
 * @property streets Streets IDs
 * @property schools Schools IDs
 * @property positions Positions IDs
 * @property religions Religions IDs
 * @property interests Interests
 * @property interestCategories Interests categories IDs
 * @property userDevices Devices
 * @property userOs Operating systems
 * @property userBrowsers Browsers
 * @property retargetingGroups Retargeting groups IDs
 * @property retargetingGroupsNot Retargeting groups IDs to except
 * @property paying Information whether the user has proceeded VK payments before
 * @property travellers Travellers only
 * @property schoolFrom School graduation year from
 * @property schoolTo School graduation year to
 * @property uniFrom University graduation year from
 * @property uniTo University graduation year to
 */
@JsonDeserialize(`as` = CriteriaImpl::class)
interface Criteria {
    val sex: CriteriaSex?
    val ageFrom: Int?
    val ageTo: Int?
    val birthday: Int?
    val country: Int?
    val cities: String?
    val citiesNot: String?
    val statuses: String?
    val groups: String?
    val apps: String?
    val appsNot: String?
    val districts: String?
    val stations: String?
    val streets: String?
    val schools: String?
    val positions: String?
    val religions: String?
    val interests: String?
    val interestCategories: String?
    val userDevices: String?
    val userOs: String?
    val userBrowsers: String?
    val retargetingGroups: String?
    val retargetingGroupsNot: String?
    val paying: Boolean?
    val travellers: PropertyExists?
    val schoolFrom: Int?
    val schoolTo: Int?
    val uniFrom: Int?
    val uniTo: Int?
}
