@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.notes.objects.NoteComment
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/notes.getComments]
 *
 * Returns a list of comments on a note.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 * @property count Number of comments to return.
 */
data class NotesGetComments(
    var noteId: Long,
    var ownerId: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<NoteComment>>("notes.getComments", jacksonTypeRef()),
    UserMethod
