@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.search.objects

/**
 * No description
 *
 * @property items No description
 * @property suggestedQueries No description
 */
data class GetHintsResponse(
    val items: List<Hint>? = null,
    val suggestedQueries: List<String>? = null
)
