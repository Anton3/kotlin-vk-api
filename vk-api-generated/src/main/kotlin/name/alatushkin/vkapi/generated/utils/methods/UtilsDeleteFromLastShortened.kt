@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserGroupServiceMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
