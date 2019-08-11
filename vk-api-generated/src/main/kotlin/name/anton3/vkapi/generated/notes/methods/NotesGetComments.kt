@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.notes.objects.NoteComment
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
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
    var noteId: Int,
    var ownerId: Int? = null,
    var count: Int? = null
) : CheckedMethod<VkList<NoteComment>, UserMethod>("notes.getComments", jacksonTypeRef())
