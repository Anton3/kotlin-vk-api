@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.notes.objects.Note
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.getById]
 *
 * Returns a note by its ID.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 */
data class NotesGetById(
    var noteId: Int,
    var ownerId: Int? = null
) : VkMethod<Note>("notes.getById", jacksonTypeRef()),
    UserMethod
