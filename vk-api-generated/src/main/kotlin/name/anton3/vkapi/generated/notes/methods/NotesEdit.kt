@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/notes.edit]
 *
 * Edits a note of the current user.
 *
 * @property noteId Note ID.
 * @property title Note title.
 * @property text Note text.
 * @property privacyView No description
 * @property privacyComment No description
 */
data class NotesEdit(
    var noteId: Int,
    var title: String,
    var text: String,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null
) : CheckedMethod<OkResponse, UserMethod>("notes.edit", jacksonTypeRef())
