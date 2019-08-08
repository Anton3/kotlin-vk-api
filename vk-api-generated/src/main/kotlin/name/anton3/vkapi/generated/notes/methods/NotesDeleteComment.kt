@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/notes.deleteComment]
 *
 * Deletes a comment on a note.
 *
 * @property commentId Comment ID.
 * @property ownerId Note owner ID.
 */
data class NotesDeleteComment(
    var commentId: Int,
    var ownerId: Int? = null
) : VkMethod<OkResponse>("notes.deleteComment", jacksonTypeRef()),
    UserMethod
