@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.wall.objects.PostAdsStealthResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/wall.postAdsStealth]
 *
 * Allows to create hidden post which will not be shown on the community's wall and can be used for creating an ad with type "Community post".
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property message (Required if 'attachments' is not set.) Text of the post.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'page' — wiki-page, 'note' — note, 'poll' — poll, 'album' — photo album, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown."
 * @property signed Only for posts in communities with 'from_group' set to '1': '1' — post will be signed with the name of the posting user, '0' — post will not be signed (default)
 * @property lat Geographical latitude of a check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of a check-in, in degrees (from -180 to 180).
 * @property placeId ID of the location where the user was tagged.
 * @property postId Post ID. Used for publishing of scheduled and suggested posts.
 * @property guid Unique identifier to avoid duplication the same post.
 * @property linkButton Link button ID
 * @property linkTitle Link title
 * @property linkImage Link image url
 */
data class WallPostAdsStealth(
    var ownerId: Int,
    var message: String? = null,
    var attachments: List<String>? = null,
    var signed: Boolean? = null,
    var lat: Double? = null,
    var long: Double? = null,
    var placeId: Int? = null,
    var postId: Int? = null,
    var guid: String? = null,
    var linkButton: String? = null,
    var linkTitle: String? = null,
    var linkImage: String? = null
) : CheckedMethod<PostAdsStealthResponse, UserMethod>("wall.postAdsStealth", jacksonTypeRef())
