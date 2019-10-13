@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.message.objects

/**
 * No description
 *
 * @property adminId No description
 * @property joined No description
 * @property localId No description
 * @property members No description
 * @property membersCount No description
 * @property title No description
 */
data class ChatPreview(
    val adminId: Int? = null,
    val joined: Boolean? = null,
    val localId: Int? = null,
    val members: List<Int>? = null,
    val membersCount: Int? = null,
    val title: String? = null
)
