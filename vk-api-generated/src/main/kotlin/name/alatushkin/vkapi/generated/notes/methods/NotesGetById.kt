@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.notes.objects.Note
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.getById]
 *
 * Returns a note by its ID.
 *
 * @property noteId Note ID.
 * @property ownerId Note owner ID.
 */
data class NotesGetById(
    var noteId: Long,
    var ownerId: Long? = null
) : VkMethod<Note>("notes.getById", jacksonTypeRef()),
    UserMethod