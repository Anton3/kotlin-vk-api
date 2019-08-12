@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
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
    var commentId: Int,
    var ownerId: Int? = null,
    var message: String? = null
) : VkMethod<OkResponse, UserMethod>("notes.editComment", jacksonTypeRef())
