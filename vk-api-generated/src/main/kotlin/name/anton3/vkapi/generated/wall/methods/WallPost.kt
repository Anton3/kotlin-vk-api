@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.wall.objects.PostResponse
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.post]
 *
 * Adds a new post on a user wall or community wall. Can also be used to publish suggested or scheduled posts.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property friendsOnly '1' — post will be available to friends only, '0' — post will be available to all users (default)
 * @property fromGroup For a community: '1' — post will be published by the community, '0' — post will be published by the user (default)
 * @property message (Required if 'attachments' is not set.) Text of the post.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'page' — wiki-page, 'note' — note, 'poll' — poll, 'album' — photo album, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown."
 * @property services List of services or websites the update will be exported to, if the user has so requested. Sample values: 'twitter', 'facebook'.
 * @property signed Only for posts in communities with 'from_group' set to '1': '1' — post will be signed with the name of the posting user, '0' — post will not be signed (default)
 * @property publishDate Publication date (in Unix time). If used, posting will be delayed until the set time.
 * @property lat Geographical latitude of a check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of a check-in, in degrees (from -180 to 180).
 * @property placeId ID of the location where the user was tagged.
 * @property postId Post ID. Used for publishing of scheduled and suggested posts.
 * @property guid No description
 * @property markAsAds No description
 */
data class WallPost(
    var ownerId: Int? = null,
    var friendsOnly: Boolean? = null,
    var fromGroup: Boolean? = null,
    var message: String? = null,
    var attachments: List<String>? = null,
    var services: String? = null,
    var signed: Boolean? = null,
    var publishDate: Int? = null,
    var lat: Double? = null,
    var long: Double? = null,
    var placeId: Int? = null,
    var postId: Int? = null,
    var guid: String? = null,
    var markAsAds: Boolean? = null
) : VkMethod<PostResponse>("wall.post", jacksonTypeRef()),
    UserMethod
