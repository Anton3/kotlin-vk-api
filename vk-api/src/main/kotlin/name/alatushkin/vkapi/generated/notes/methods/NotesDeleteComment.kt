@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.notes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/notes.deleteComment]
 *
 * Deletes a comment on a note.
 *
 * @property commentId Comment ID.
 * @property ownerId Note owner ID.
 */
data class NotesDeleteComment(
    var commentId: Long,
    var ownerId: Long? = null
) : VkMethod<OkResponse>(
    "notes.deleteComment",
    jacksonTypeRef()
), UserMethod
