@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property name Link label
 * @property desc Link description
 * @property editTitle No description
 * @property id Link ID
 * @property imageProcessing No description
 * @property url Link URL
 */
data class GroupLink(
    val name: String? = null,
    val desc: String? = null,
    val editTitle: BoolInt? = null,
    val id: Int? = null,
    val imageProcessing: BoolInt? = null,
    val url: String? = null
)
