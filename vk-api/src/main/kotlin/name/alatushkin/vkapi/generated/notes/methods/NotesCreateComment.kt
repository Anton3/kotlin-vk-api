@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.createComment]
 *
 * Adds a new comment on a note.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 * @property replyTo ID of the user to whom the reply is addressed (if the comment is a reply to another comment).
 * @property message Comment text.
 * @property guid 
 */
data class NotesCreateComment(
    var noteId: Long,
    var ownerId: Long? = null,
    var replyTo: Long? = null,
    var message: String,
    var guid: String? = null
) : VkMethod<Long>(
    "notes.createComment",
    jacksonTypeRef()
), UserMethod
