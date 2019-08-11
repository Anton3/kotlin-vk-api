@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/notes.add]
 *
 * Creates a new note for the current user.
 *
 * @property title Note title.
 * @property text Note text.
 * @property privacyView No description
 * @property privacyComment No description
 */
data class NotesAdd(
    var title: String,
    var text: String,
    var privacyView: List<String>? = null,
    var privacyComment: List<String>? = null
) : CheckedMethod<Int, UserMethod>("notes.add", jacksonTypeRef())
