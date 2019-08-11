@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.docs.objects.AddResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

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
    var ownerId: Int,
    var docId: Int,
    var accessKey: String? = null
) : CheckedMethod<AddResponse, UserMethod>("docs.add", jacksonTypeRef())
