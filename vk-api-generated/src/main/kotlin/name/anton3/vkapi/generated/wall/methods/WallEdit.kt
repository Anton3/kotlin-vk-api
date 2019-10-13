@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.wall.objects.EditResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/wall.edit]
 *
 * Edits a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId No description
 * @property friendsOnly No description
 * @property message (Required if 'attachments' is not set.) Text of the post.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error is thrown."
 * @property services No description
 * @property signed No description
 * @property publishDate No description
 * @property lat No description
 * @property long No description
 * @property placeId No description
 * @property markAsAds No description
 * @property closeComments No description
 * @property posterBkgId No description
 * @property posterBkgOwnerId No description
 * @property posterBkgAccessHash No description
 */
data class WallEdit(
    var ownerId: Int? = null,
    var postId: Int,
    var friendsOnly: Boolean? = null,
    var message: String? = null,
    var attachments: List<String>? = null,
    var services: String? = null,
    var signed: Boolean? = null,
    var publishDate: Int? = null,
    var lat: Double? = null,
    var long: Double? = null,
    var placeId: Int? = null,
    var markAsAds: Boolean? = null,
    var closeComments: Boolean? = null,
    var posterBkgId: Int? = null,
    var posterBkgOwnerId: Int? = null,
    var posterBkgAccessHash: String? = null
) : VkMethod<EditResponse, UserMethod>("wall.edit", jacksonTypeRef())
