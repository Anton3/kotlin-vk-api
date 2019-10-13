@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property alcohol User's views on alcohol
 * @property inspiredBy User's inspired by
 * @property langs No description
 * @property lifeMain User's personal priority in life
 * @property peopleMain User's personal priority in people
 * @property political User's political views
 * @property religion User's religion
 * @property religionId User's religion id
 * @property smoking User's views on smoking
 */
data class Personal(
    val alcohol: Int? = null,
    val inspiredBy: String? = null,
    val langs: List<String>? = null,
    val lifeMain: Int? = null,
    val peopleMain: Int? = null,
    val political: Int? = null,
    val religion: String? = null,
    val religionId: Int? = null,
    val smoking: Int? = null
)
