@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getMarketAlbumUploadServer]
 *
 * Returns the server address for market album photo upload.
 *
 * @property groupId Community ID.
 */
data class PhotosGetMarketAlbumUploadServer(
    var groupId: Long
) : VkMethod<UploadServer>("photos.getMarketAlbumUploadServer", jacksonTypeRef()),
    UserMethod
