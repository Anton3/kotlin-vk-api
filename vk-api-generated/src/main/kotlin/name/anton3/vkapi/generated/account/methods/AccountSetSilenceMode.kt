@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.setSilenceMode]
 *
 * Mutes push notifications for the set period of time.
 *
 * @property deviceId Unique device ID.
 * @property time Time in seconds for what notifications should be disabled. '-1' to disable forever.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 * @property sound '1' — to enable sound in this dialog, '0' — to disable sound. Only if 'peer_id' contains user or community ID.
 */
data class AccountSetSilenceMode(
    var deviceId: String? = null,
    var time: Int? = null,
    var peerId: Int? = null,
    var sound: Int? = null
) : VkMethod<OkResponse, UserMethod>("account.setSilenceMode", jacksonTypeRef())
