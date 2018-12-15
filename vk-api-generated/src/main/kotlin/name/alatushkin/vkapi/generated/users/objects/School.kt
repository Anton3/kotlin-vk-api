package name.alatushkin.vkapi.generated.users.objects

/**
 * No description
 *
 * @property id School ID
 * @property country Country ID
 * @property city City ID
 * @property name School name
 * @property yearFrom Year the user started to study
 * @property yearTo Year the user finished to study
 * @property yearGraduated Graduation year
 * @property class School class letter
 * @property type School type ID
 * @property typeStr School type name
 */
data class School(
    val id: String? = null,
    val country: Long? = null,
    val city: Long? = null,
    val name: String? = null,
    val yearFrom: Long? = null,
    val yearTo: Long? = null,
    val yearGraduated: Long? = null,
    val `class`: String? = null,
    val type: Long? = null,
    val typeStr: String? = null
)
