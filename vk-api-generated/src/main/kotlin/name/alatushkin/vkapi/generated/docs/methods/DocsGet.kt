@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.docs.objects.Doc
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/docs.get]
 *
 * Returns detailed information about user or community documents.
 *
 * @property count Number of documents to return. By default, all documents.
 * @property offset Offset needed to return a specific subset of documents.
 * @property ownerId ID of the user or community that owns the documents. Use a negative value to designate a community ID.
 */
data class DocsGet(
    var count: Long? = null,
    var offset: Long? = null,
    var ownerId: Long? = null
) : VkMethod<VkList<Doc>>("docs.get", jacksonTypeRef()),
    UserMethod
