@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
class NotesEditMethod(
        noteId: Long,
        title: String,
        text: String,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null
) : VkMethod<Boolean>(
    "notes.edit",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var noteId: Long by props
    var title: String by props
    var text: String by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props

    init {
        this.noteId = noteId
        this.title = title
        this.text = text
        this.privacyView = privacyView
        this.privacyComment = privacyComment
    }

    fun setNoteId(noteId: Long): NotesEditMethod {
        this.noteId = noteId
        return this
    }

    fun setTitle(title: String): NotesEditMethod {
        this.title = title
        return this
    }

    fun setText(text: String): NotesEditMethod {
        this.text = text
        return this
    }

    fun setPrivacyView(privacyView: Array<String>): NotesEditMethod {
        this.privacyView = privacyView
        return this
    }

    fun setPrivacyComment(privacyComment: Array<String>): NotesEditMethod {
        this.privacyComment = privacyComment
        return this
    }
}
