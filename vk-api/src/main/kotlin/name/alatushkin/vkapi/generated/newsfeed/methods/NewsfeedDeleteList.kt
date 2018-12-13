@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse

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
