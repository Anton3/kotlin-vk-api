@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupServiceMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/utils.deleteFromLastShortened]
 *
 * Deletes shortened link from user's list.
 *
 * @property key Link key (characters after vk.cc/).
 */
data class UtilsDeleteFromLastShortened(
    var key: String
) : VkMethod<OkResponse>("utils.deleteFromLastShortened", jacksonTypeRef()),
    UserGroupServiceMethod
