@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.notes.objects.Note
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/notes.get]
 *
 * Returns a list of notes created by a user.
 *
 * @property noteIds Note IDs.
 * @property userId Note owner ID.
 * @property count Number of notes to return.
 */
data class NotesGet(
    var noteIds: List<Int>? = null,
    var userId: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<Note>>("notes.get", jacksonTypeRef()),
    UserMethod
