@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.edit]
 *
 * Edits a note of the current user.
 *
 * @property noteId Note ID.
 * @property title Note title.
 * @property text Note text.
 * @property privacyView 
 * @property privacyComment 
 */
data class NotesEdit(
    var noteId: Long,
    var title: String,
    var text: String,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null
) : VkMethod<OkResponse>(
    "notes.edit",
    jacksonTypeRef()
), UserMethod
