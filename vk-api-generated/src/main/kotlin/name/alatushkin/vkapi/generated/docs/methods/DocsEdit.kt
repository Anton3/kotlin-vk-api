@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/docs.edit]
 *
 * Edits a document.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property docId Document ID.
 * @property title Document title.
 * @property tags Document tags.
 */
data class DocsEdit(
    var ownerId: Long,
    var docId: Long,
    var title: String? = null,
    var tags: List<String>? = null
) : VkMethod<OkResponse>("docs.edit", jacksonTypeRef()),
    UserMethod
