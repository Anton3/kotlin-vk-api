@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.addresses.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Fields(override val value: String) : ValueEnum<String> {
    ID("id"),
    TITLE("title"),
    ADDRESS("address"),
    ADDITIONAL_ADDRESS("additional_address"),
    COUNTRY_ID("country_id"),
    CITY_ID("city_id"),
    METRO_STATION_ID("metro_station_id"),
    LATITUDE("latitude"),
    LONGITUDE("longitude"),
    DISTANCE("distance"),
    WORK_INFO_STATUS("work_info_status"),
    TIMETABLE("timetable"),
    PHONE("phone"),
    TIME_OFFSET("time_offset")
}
