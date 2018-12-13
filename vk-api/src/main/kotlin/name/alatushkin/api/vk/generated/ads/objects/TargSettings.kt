package name.alatushkin.api.vk.generated.ads.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.PropertyExists

data class TargSettings(
    val id: Long? = null,
    val campaignId: Long? = null,
    override val sex: CriteriaSex? = null,
    override val ageFrom: Long? = null,
    override val ageTo: Long? = null,
    override val birthday: Long? = null,
    override val country: Long? = null,
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
    override val schoolFrom: Long? = null,
    override val schoolTo: Long? = null,
    override val uniFrom: Long? = null,
    override val uniTo: Long? = null
) : Criteria
