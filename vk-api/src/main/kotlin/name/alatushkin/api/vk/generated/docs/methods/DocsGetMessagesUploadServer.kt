@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.UploadServer
import name.alatushkin.api.vk.generated.docs.objects.GetMessagesUploadServerType
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/docs.getMessagesUploadServer]
 *
 * Returns the server address for document upload.
 *
 * @property type Document type.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 */
data class DocsGetMessagesUploadServer(
    var type: GetMessagesUploadServerType? = null,
    var peerId: Long? = null
) : VkMethod<UploadServer>(
    "docs.getMessagesUploadServer",
    jacksonTypeRef()
), UserGroupMethod
