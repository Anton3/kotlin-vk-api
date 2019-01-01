@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.docs.objects.DocTypes
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/docs.getTypes]
 *
 * Returns documents types available for current user.
 *
 * @property ownerId ID of the user or community that owns the documents. Use a negative value to designate a community ID.
 */
data class DocsGetTypes(
    var ownerId: Int
) : VkMethod<VkList<DocTypes>>("docs.getTypes", jacksonTypeRef()),
    UserMethod
