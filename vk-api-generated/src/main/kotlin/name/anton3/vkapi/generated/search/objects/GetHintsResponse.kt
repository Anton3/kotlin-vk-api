@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.search.objects

/**
 * No description
 *
 * @property count No description
 * @property items No description
 * @property suggestedQueries No description
 */
data class GetHintsResponse(
    val count: Int,
    val items: List<Hint>,
    val suggestedQueries: List<String>? = null
)
