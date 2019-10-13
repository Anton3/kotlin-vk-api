@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.newsfeed.objects.IgnoreItemType
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/newsfeed.ignoreItem]
 *
 * Hides an item from the newsfeed.
 *
 * @property type No description
 * @property ownerId Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
 * @property itemId Item identifier
 */
data class NewsfeedIgnoreItem(
    var type: IgnoreItemType,
    var ownerId: Int,
    var itemId: Int
) : VkMethod<OkResponse, UserMethod>("newsfeed.ignoreItem", jacksonTypeRef())
