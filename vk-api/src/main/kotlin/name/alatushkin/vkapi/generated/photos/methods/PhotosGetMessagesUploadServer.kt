@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.photos.objects.PhotoUpload
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/photos.getMessagesUploadServer]
 *
 * Returns the server address for photo upload in a private message for a user.
 *
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'Chat ID', e.g. '2000000001'. For community: '- Community ID', e.g. '-12345'. "
 */
data class PhotosGetMessagesUploadServer(
    var peerId: Long? = null
) : VkMethod<PhotoUpload>(
    "photos.getMessagesUploadServer",
    jacksonTypeRef()
), UserGroupMethod
