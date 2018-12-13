@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.Image
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveOwnerCoverPhoto]
 *
 * Saves cover photo after successful uploading.
 *
 * @property photo Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 * @property hash Parameter returned when photos are [vk.com/dev/upload_files|uploaded to server].
 */
data class PhotosSaveOwnerCoverPhoto(
    var photo: String,
    var hash: String
) : VkMethod<List<Image>>(
    "photos.saveOwnerCoverPhoto",
    jacksonTypeRef()
), UserMethod
