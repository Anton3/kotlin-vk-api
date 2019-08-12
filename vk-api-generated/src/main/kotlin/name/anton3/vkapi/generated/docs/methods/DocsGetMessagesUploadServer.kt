@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.generated.docs.objects.GetMessagesUploadServerType
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

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
    var peerId: Int? = null
) : VkMethod<UploadServer, UserGroupMethod>("docs.getMessagesUploadServer", jacksonTypeRef())
