@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod

/**
 * [https://vk.com/dev/ads.getVideoUploadURL]
 *
 * Returns URL to upload an ad video to.
 *

 */
class AdsGetVideoUploadURL : VkMethod<String>("ads.getVideoUploadURL", jacksonTypeRef())
