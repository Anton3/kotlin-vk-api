@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getMarketAlbumUploadServer]
 *
 * Returns the server address for market album photo upload.
 *
 * @property groupId Community ID.
 */
data class PhotosGetMarketAlbumUploadServer(
    var groupId: Long
) : VkMethod<UploadServer>(
    "photos.getMarketAlbumUploadServer",
    jacksonTypeRef()
), UserMethod
