@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse

/**
 * [https://vk.com/dev/newsfeed.deleteList]
 *
 * null
 *
 * @property listId 
 */
data class NewsfeedDeleteList(
    var listId: Long
) : VkMethod<OkResponse>(
    "newsfeed.deleteList",
    jacksonTypeRef()
)
