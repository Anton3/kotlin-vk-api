@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.getById]
 *
 * Returns information about documents by their IDs.
 *
 * @property docs Document IDs. Example: , "66748_91488,66748_91455",
 */
data class DocsGetById(
    var docs: List<String>
) : VkMethod<List<Doc>>("docs.getById", jacksonTypeRef()),
    UserMethod
