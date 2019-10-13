@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.notes.objects.NoteComment
import name.anton3.vkapi.generated.notes.objects.Sort
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/notes.getComments]
 *
 * Returns a list of comments on a note.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 * @property sort No description
 * @property offset No description
 * @property count Number of comments to return.
 */
data class NotesGetComments(
    var noteId: Int,
    var ownerId: Int? = null,
    var sort: Sort? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<NoteComment>, UserMethod>("notes.getComments", jacksonTypeRef())
