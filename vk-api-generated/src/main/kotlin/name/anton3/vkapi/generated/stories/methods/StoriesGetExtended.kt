@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.stories.objects.GetExtendedResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/stories.get]
 *
 * Returns stories available for current user.
 *
 * @property ownerId Owner ID.
 */
data class StoriesGetExtended(
    var ownerId: Int? = null
) : CheckedMethod<GetExtendedResponse, UserGroupMethod>("stories.get", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
