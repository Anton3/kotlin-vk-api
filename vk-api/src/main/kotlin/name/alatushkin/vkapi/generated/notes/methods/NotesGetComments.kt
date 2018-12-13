@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.notes.objects.NoteComment
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
) : VkMethod<VkList<NoteComment>>(
    "notes.getComments",
    jacksonTypeRef()
), UserMethod
