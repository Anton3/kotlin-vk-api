@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.docs.objects.AddResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.add]
 *
 * Copies a document to a user's or community's document list.
 *
 * @property ownerId ID of the user or community that owns the document. Use a negative value to designate a community ID.
 * @property docId Document ID.
 * @property accessKey Access key. This parameter is required if 'access_key' was returned with the document's data.
 */
data class DocsAdd(
    var ownerId: Long,
    var docId: Long,
    var accessKey: String? = null
) : VkMethod<AddResponse>(
    "docs.add",
    jacksonTypeRef()
), UserMethod
