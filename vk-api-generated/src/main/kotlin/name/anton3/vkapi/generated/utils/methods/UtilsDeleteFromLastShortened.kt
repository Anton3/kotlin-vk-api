@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupServiceMethod
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
) : CheckedMethod<OkResponse, UserGroupServiceMethod>("utils.deleteFromLastShortened", jacksonTypeRef())
