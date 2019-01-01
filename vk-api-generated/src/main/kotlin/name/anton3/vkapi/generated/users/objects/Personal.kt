package name.anton3.vkapi.generated.users.objects

/**
 * No description
 *
 * @property political User's political views
 * @property langs No description
 * @property religion User's religion
 * @property inspiredBy User's inspired by
 * @property peopleMain User's personal priority in people
 * @property lifeMain User's personal priority in life
 * @property smoking User's views on smoking
 * @property alcohol User's views on alcohol
 */
data class Personal(
    val political: Int? = null,
    val langs: List<String>? = null,
    val religion: String? = null,
    val inspiredBy: String? = null,
    val peopleMain: Int? = null,
    val lifeMain: Int? = null,
    val smoking: Int? = null,
    val alcohol: Int? = null
)
