@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.ChronologicalSort
import name.anton3.vkapi.generated.notes.objects.Note
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/notes.get]
 *
 * Returns a list of notes created by a user.
 *
 * @property noteIds Note IDs.
 * @property userId Note owner ID.
 * @property offset No description
 * @property count Number of notes to return.
 * @property sort No description
 */
data class NotesGet(
    var noteIds: List<Int>? = null,
    var userId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var sort: ChronologicalSort? = null
) : VkMethod<VkList<Note>, UserMethod>("notes.get", jacksonTypeRef())
