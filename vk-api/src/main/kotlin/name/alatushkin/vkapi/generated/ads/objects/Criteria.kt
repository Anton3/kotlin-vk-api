package name.alatushkin.vkapi.generated.ads.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.PropertyExists

interface Criteria {
    val sex: CriteriaSex?
    val ageFrom: Long?
    val ageTo: Long?
    val birthday: Long?
    val country: Long?
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
    val paying: BoolInt?
    val travellers: PropertyExists?
    val schoolFrom: Long?
    val schoolTo: Long?
    val uniFrom: Long?
    val uniTo: Long?
}
