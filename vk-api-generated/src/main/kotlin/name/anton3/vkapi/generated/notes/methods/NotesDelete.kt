@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/notes.delete]
 *
 * Deletes a note of the current user.
 *
 * @property noteId Note ID.
 */
data class NotesDelete(
    var noteId: Long
) : VkMethod<OkResponse>("notes.delete", jacksonTypeRef()),
    UserMethod
