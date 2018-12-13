@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.docs.objects.DocTypes
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/docs.getTypes]
 *
 * Returns documents types available for current user.
 *
 * @property ownerId ID of the user or community that owns the documents. Use a negative value to designate a community ID.
 */
data class DocsGetTypes(
    var ownerId: Long
) : VkMethod<VkList<DocTypes>>(
    "docs.getTypes",
    jacksonTypeRef()
), UserMethod
