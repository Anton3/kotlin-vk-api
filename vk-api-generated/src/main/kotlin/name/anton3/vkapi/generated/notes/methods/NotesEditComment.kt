@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/notes.editComment]
 *
 * Edits a comment on a note.
 *
 * @property commentId Comment ID.
 * @property ownerId Note owner ID.
 * @property message New comment text.
 */
data class NotesEditComment(
    var commentId: Long,
    var ownerId: Long? = null,
    var message: String? = null
) : VkMethod<OkResponse>("notes.editComment", jacksonTypeRef()),
    UserMethod
