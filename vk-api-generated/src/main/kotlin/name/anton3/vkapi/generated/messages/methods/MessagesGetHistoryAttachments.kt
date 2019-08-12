@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.GetHistoryAttachmentsMediaType
import name.anton3.vkapi.generated.messages.objects.GetHistoryAttachmentsResponse
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.getHistoryAttachments]
 *
 * Returns media files from the dialog or group chat.
 *
 * @property peerId Peer ID. ", For group chat: '2000000000 + chat ID' , , For community: '-community ID'"
 * @property mediaType Type of media files to return: *'photo',, *'video',, *'audio',, *'doc',, *'link'.,*'market'.,*'wall'.,*'share'
 * @property startFrom Message ID to start return results from.
 * @property count Number of objects to return.
 * @property photoSizes '1' — to return photo sizes in a
 * @property fields Additional profile [vk.com/dev/fields|fields] to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetHistoryAttachments(
    var peerId: Int,
    var mediaType: GetHistoryAttachmentsMediaType? = null,
    var startFrom: String? = null,
    var count: Int? = null,
    var photoSizes: Boolean? = null,
    var fields: List<String>? = null,
    var groupId: Int? = null
) : VkMethod<GetHistoryAttachmentsResponse, UserGroupMethod>("messages.getHistoryAttachments", jacksonTypeRef())
