@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/board.addTopic]
 *
 * Creates a new topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property title Topic title.
 * @property text Text of the topic.
 * @property fromGroup For a community: '1' — to post the topic as by the community, '0' — to post the topic as by the user (default)
 * @property attachments List of media objects attached to the topic, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media object: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID. Example: "photo100172_166443618,photo66748_265827614", , "NOTE: If you try to attach more than one reference, an error will be thrown.",
 */
data class BoardAddTopic(
    var groupId: Int,
    var title: String,
    var text: String? = null,
    var fromGroup: Boolean? = null,
    var attachments: List<String>? = null
) : VkMethod<Int>("board.addTopic", jacksonTypeRef()),
    UserMethod
