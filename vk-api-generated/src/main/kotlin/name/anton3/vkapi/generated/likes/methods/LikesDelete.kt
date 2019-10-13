@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.likes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.likes.objects.DeleteResponse
import name.anton3.vkapi.generated.likes.objects.Type
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/likes.delete]
 *
 * Deletes the specified object from the 'Likes' list of the current user.
 *
 * @property type No description
 * @property ownerId ID of the user or community that owns the object.
 * @property itemId Object ID.
 */
data class LikesDelete(
    var type: Type,
    var ownerId: Int? = null,
    var itemId: Int
) : VkMethod<DeleteResponse, UserMethod>("likes.delete", jacksonTypeRef())
