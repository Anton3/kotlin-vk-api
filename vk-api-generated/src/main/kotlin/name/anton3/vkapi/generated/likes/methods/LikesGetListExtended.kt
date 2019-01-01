@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.likes.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.likes.objects.GetListFilter
import name.anton3.vkapi.generated.likes.objects.Type
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.tokens.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/likes.getList]
 *
 * Returns a list of IDs of users who added the specified object to their 'Likes' list.
 *
 * @property type , Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 * @property ownerId ID of the user, community, or application that owns the object. If the 'type' parameter is set as 'sitepage', the application ID is passed as 'owner_id'. Use negative value for a community id. If the 'type' parameter is not set, the 'owner_id' is assumed to be either the current user or the same application ID as if the 'type' parameter was set to 'sitepage'.
 * @property itemId Object ID. If 'type' is set as 'sitepage', 'item_id' can include the 'page_id' parameter value used during initialization of the [vk.com/dev/Like|Like widget].
 * @property pageUrl URL of the page where the [vk.com/dev/Like|Like widget] is installed. Used instead of the 'item_id' parameter.
 * @property filter Filters to apply: 'likes' — returns information about all users who liked the object (default), 'copies' — returns information only about users who told their friends about the object
 * @property friendsOnly Specifies which users are returned: '1' — to return only the current user's friends, '0' — to return all users (default)
 * @property offset Offset needed to select a specific subset of users.
 * @property count Number of user IDs to return (maximum '1000'). Default is '100' if 'friends_only' is set to '0', otherwise, the default is '10' if 'friends_only' is set to '1'.
 * @property skipOwn No description
 */
data class LikesGetListExtended(
    var type: Type,
    var ownerId: Int? = null,
    var itemId: Int? = null,
    var pageUrl: String? = null,
    var filter: GetListFilter? = null,
    var friendsOnly: Boolean? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var skipOwn: Boolean? = null
) : VkMethod<VkList<UserMin>>("likes.getList", jacksonTypeRef()),
    UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
