@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "docs.edit",
    jacksonTypeRef()
), UserMethod
