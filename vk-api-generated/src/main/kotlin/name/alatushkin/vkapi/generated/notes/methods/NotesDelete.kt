@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
