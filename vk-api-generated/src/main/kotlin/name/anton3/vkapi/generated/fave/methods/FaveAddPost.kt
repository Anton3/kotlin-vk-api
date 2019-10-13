@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.addPost]
 *
 * No description
 *
 * @property ownerId No description
 * @property id No description
 * @property accessKey No description
 */
data class FaveAddPost(
    var ownerId: Int,
    var id: Int,
    var accessKey: String? = null
) : VkMethod<OkResponse, UserMethod>("fave.addPost", jacksonTypeRef())
