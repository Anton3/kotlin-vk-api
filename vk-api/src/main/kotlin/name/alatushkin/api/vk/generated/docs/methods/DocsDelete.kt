@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.delete]
 *
 * Deletes a user or community document.
 *
 * @property ownerId ID of the user or community that owns the document. Use a negative value to designate a community ID.
 * @property docId Document ID.
 */
data class DocsDelete(
    var ownerId: Long,
    var docId: Long
) : VkMethod<OkResponse>(
    "docs.delete",
    jacksonTypeRef()
), UserMethod
