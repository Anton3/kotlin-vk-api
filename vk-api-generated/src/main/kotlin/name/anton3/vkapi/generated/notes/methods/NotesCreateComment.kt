@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.createComment]
 *
 * Adds a new comment on a note.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 * @property replyTo ID of the user to whom the reply is addressed (if the comment is a reply to another comment).
 * @property message Comment text.
 * @property guid No description
 */
data class NotesCreateComment(
    var noteId: Int,
    var ownerId: Int? = null,
    var replyTo: Int? = null,
    var message: String,
    var guid: String? = null
) : VkMethod<Int>("notes.createComment", jacksonTypeRef()),
    UserMethod
