@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.edit]
 *
 * Edits a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property friendsOnly (Applies only when editing a scheduled post.), '1' — post will be available to friends only, '0' — post will be available to all users (default)
 * @property message (Required if 'attachments' is not set.) Text of the post.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error is thrown."
 * @property services (Applies only to a scheduled post.) List of services or websites where status will be updated, if the user has so requested. Sample values: 'twitter', 'facebook'.
 * @property signed (Applies only to a post that was created "as community" on a community wall.), '1' — to add the signature of the user who created the post
 * @property publishDate (Applies only to a scheduled post.) Publication date (in Unix time). If used, posting will be delayed until the set time.
 * @property lat Geographical latitude of the check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of the check-in, in degrees (from -180 to 180).
 * @property placeId ID of the location where the user was tagged.
 * @property markAsAds 
 */
data class WallEdit(
    var ownerId: Long? = null,
    var postId: Long,
    var friendsOnly: Boolean? = null,
    var message: String? = null,
    var attachments: List<String>? = null,
    var services: String? = null,
    var signed: Boolean? = null,
    var publishDate: Long? = null,
    var lat: Double? = null,
    var long: Double? = null,
    var placeId: Long? = null,
    var markAsAds: Boolean? = null
) : VkMethod<OkResponse>(
    "wall.edit",
    jacksonTypeRef()
), UserMethod
