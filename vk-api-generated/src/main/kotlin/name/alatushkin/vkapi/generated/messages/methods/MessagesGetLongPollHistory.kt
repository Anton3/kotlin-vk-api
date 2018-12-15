@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.messages.objects.GetLongPollHistoryResponse
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getLongPollHistory]
 *
 * Returns updates in user's private messages.
 *
 * @property ts Last value of the 'ts' parameter returned from the Long Poll server or by using [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
 * @property pts Lsat value of 'pts' parameter returned from the Long Poll server or by using [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
 * @property previewLength Number of characters after which to truncate a previewed message. To preview the full message, specify '0'. "NOTE: Messages are not truncated by default. Messages are truncated by words."
 * @property onlines '1' — to return history with online users only.
 * @property fields Additional profile [vk.com/dev/fields|fields] to return.
 * @property eventsLimit Maximum number of events to return.
 * @property msgsLimit Maximum number of messages to return.
 * @property maxMsgId Maximum ID of the message among existing ones in the local copy. Both messages received with API methods (for example, , ), and data received from a Long Poll server (events with code 4) are taken into account.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesGetLongPollHistory(
    var ts: Long? = null,
    var pts: Long? = null,
    var previewLength: Long? = null,
    var onlines: Boolean? = null,
    var fields: List<String>? = null,
    var eventsLimit: Long? = null,
    var msgsLimit: Long? = null,
    var maxMsgId: Long? = null,
    var groupId: Long? = null
) : VkMethod<GetLongPollHistoryResponse>("messages.getLongPollHistory", jacksonTypeRef()),
    UserGroupMethod
