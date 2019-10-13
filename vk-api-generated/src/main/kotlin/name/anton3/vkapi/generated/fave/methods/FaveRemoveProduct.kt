@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.removeProduct]
 *
 * No description
 *
 * @property ownerId No description
 * @property id No description
 */
data class FaveRemoveProduct(
    var ownerId: Int,
    var id: Int
) : VkMethod<OkResponse, UserMethod>("fave.removeProduct", jacksonTypeRef())
