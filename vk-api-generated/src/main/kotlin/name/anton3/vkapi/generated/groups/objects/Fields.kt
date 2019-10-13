@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class Fields(override val value: String) : ValueEnum<String> {
    SEX("sex"),
    BDATE("bdate"),
    CITY("city"),
    COUNTRY("country"),
    PHOTO_50("photo_50"),
    PHOTO_100("photo_100"),
    PHOTO_200_ORIG("photo_200_orig"),
    PHOTO_200("photo_200"),
    PHOTO_400_ORIG("photo_400_orig"),
    PHOTO_MAX("photo_max"),
    PHOTO_MAX_ORIG("photo_max_orig"),
    ONLINE("online"),
    ONLINE_MOBILE("online_mobile"),
    LISTS("lists"),
    DOMAIN("domain"),
    HAS_MOBILE("has_mobile"),
    CONTACTS("contacts"),
    CONNECTIONS("connections"),
    SITE("site"),
    EDUCATION("education"),
    UNIVERSITIES("universities"),
    SCHOOLS("schools"),
    CAN_POST("can_post"),
    CAN_SEE_ALL_POSTS("can_see_all_posts"),
    CAN_SEE_AUDIO("can_see_audio"),
    CAN_WRITE_PRIVATE_MESSAGE("can_write_private_message"),
    STATUS("status"),
    LAST_SEEN("last_seen"),
    COMMON_COUNT("common_count"),
    RELATION("relation"),
    RELATIVES("relatives"),
    COUNTERS("counters")
}
