@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.notes.objects.Note
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/notes.getById]
 *
 * Returns a note by its ID.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 * @property needWiki No description
 */
data class NotesGetById(
    var noteId: Int,
    var ownerId: Int? = null,
    var needWiki: Boolean? = null
) : VkMethod<Note, UserMethod>("notes.getById", jacksonTypeRef())
