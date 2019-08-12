@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/photos.getMarketAlbumUploadServer]
 *
 * Returns the server address for market album photo upload.
 *
 * @property groupId Community ID.
 */
data class PhotosGetMarketAlbumUploadServer(
    var groupId: Int
) : VkMethod<UploadServer, UserMethod>("photos.getMarketAlbumUploadServer", jacksonTypeRef())
