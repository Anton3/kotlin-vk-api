@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property city City ID
 * @property class School class letter
 * @property country Country ID
 * @property id School ID
 * @property name School name
 * @property type School type ID
 * @property typeStr School type name
 * @property yearFrom Year the user started to study
 * @property yearGraduated Graduation year
 * @property yearTo Year the user finished to study
 */
data class School(
    val city: Int? = null,
    val `class`: String? = null,
    val country: Int? = null,
    val id: String? = null,
    val name: String? = null,
    val type: Int? = null,
    val typeStr: String? = null,
    val yearFrom: Int? = null,
    val yearGraduated: Int? = null,
    val yearTo: Int? = null
)
