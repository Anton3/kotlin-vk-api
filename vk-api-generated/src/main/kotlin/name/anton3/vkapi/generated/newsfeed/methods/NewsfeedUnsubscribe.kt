@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.newsfeed.objects.UnsubscribeType
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/newsfeed.unsubscribe]
 *
 * Unsubscribes the current user from specified newsfeeds.
 *
 * @property type Type of object from which to unsubscribe: 'note' — note, 'photo' — photo, 'post' — post on user wall or community wall, 'topic' — topic, 'video' — video
 * @property ownerId Object owner ID.
 * @property itemId Object ID.
 */
data class NewsfeedUnsubscribe(
    var type: UnsubscribeType,
    var ownerId: Long? = null,
    var itemId: Long
) : VkMethod<OkResponse>("newsfeed.unsubscribe", jacksonTypeRef()),
    UserMethod
