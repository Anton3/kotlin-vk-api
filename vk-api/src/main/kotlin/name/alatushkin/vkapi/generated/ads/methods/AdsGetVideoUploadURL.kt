@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod

/**
 * [https://vk.com/dev/ads.getVideoUploadURL]
 *
 * Returns URL to upload an ad video to.
 *

 */
class AdsGetVideoUploadURL : VkMethod<String>(
    "ads.getVideoUploadURL",
    jacksonTypeRef()
)
