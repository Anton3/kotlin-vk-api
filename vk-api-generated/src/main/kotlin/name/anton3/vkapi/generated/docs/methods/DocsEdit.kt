@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var ownerId: Int,
    var docId: Int,
    var title: String? = null,
    var tags: List<String>? = null
) : VkMethod<OkResponse, UserMethod>("docs.edit", jacksonTypeRef())
