@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class LookupContactsFields(override val value: String) : ValueEnum<String> {
    NICKNAME("nickname"),
    DOMAIN("domain"),
    SEX("sex"),
    BDATE("bdate"),
    CITY("city"),
    COUNTRY("country"),
    TIMEZONE("timezone"),
    PHOTO_50("photo_50"),
    PHOTO_100("photo_100"),
    PHOTO_200_ORIG("photo_200_orig"),
    HAS_MOBILE("has_mobile"),
    CONTACTS("contacts"),
    EDUCATION("education"),
    ONLINE("online"),
    RELATION("relation"),
    LAST_SEEN("last_seen"),
    STATUS("status"),
    CAN_WRITE_PRIVATE_MESSAGE("can_write_private_message"),
    CAN_SEE_ALL_POSTS("can_see_all_posts"),
    CAN_POST("can_post"),
    UNIVERSITIES("universities")
}
