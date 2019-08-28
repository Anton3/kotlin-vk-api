@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.PropertyExists

/**
 * No description
 *
 * @property id Ad ID
 * @property campaignId Campaign ID
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
@JsonDeserialize(`as` = Void::class)
data class TargSettings(
    val id: Int? = null,
    val campaignId: Int? = null,
    override val sex: CriteriaSex? = null,
    override val ageFrom: Int? = null,
    override val ageTo: Int? = null,
    override val birthday: Int? = null,
    override val country: Int? = null,
    override val cities: String? = null,
    override val citiesNot: String? = null,
    override val statuses: String? = null,
    override val groups: String? = null,
    override val apps: String? = null,
    override val appsNot: String? = null,
    override val districts: String? = null,
    override val stations: String? = null,
    override val streets: String? = null,
    override val schools: String? = null,
    override val positions: String? = null,
    override val religions: String? = null,
    override val interests: String? = null,
    override val interestCategories: String? = null,
    override val userDevices: String? = null,
    override val userOs: String? = null,
    override val userBrowsers: String? = null,
    override val retargetingGroups: String? = null,
    override val retargetingGroupsNot: String? = null,
    override val paying: BoolInt? = null,
    override val travellers: PropertyExists? = null,
    override val schoolFrom: Int? = null,
    override val schoolTo: Int? = null,
    override val uniFrom: Int? = null,
    override val uniTo: Int? = null
) : Criteria
