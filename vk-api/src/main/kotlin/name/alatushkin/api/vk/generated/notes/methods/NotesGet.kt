@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.notes.objects.Note
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var noteIds: List<Long>? = null,
    var userId: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<Note>>(
    "notes.get",
    jacksonTypeRef()
), UserMethod
