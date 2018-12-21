@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getMarketUploadServer]
 *
 * Returns the server address for market photo upload.
 *
 * @property groupId Community ID.
 * @property mainPhoto '1' if you want to upload the main item photo.
 * @property cropX X coordinate of the crop left upper corner.
 * @property cropY Y coordinate of the crop left upper corner.
 * @property cropWidth Width of the cropped photo in px.
 */
data class PhotosGetMarketUploadServer(
    var groupId: Long,
    var mainPhoto: Boolean? = null,
    var cropX: Long? = null,
    var cropY: Long? = null,
    var cropWidth: Long? = null
) : VkMethod<UploadServer>("photos.getMarketUploadServer", jacksonTypeRef()),
    UserMethod
