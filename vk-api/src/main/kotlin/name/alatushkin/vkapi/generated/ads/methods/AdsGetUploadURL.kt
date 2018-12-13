@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.GetUploadURLAdFormat
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getUploadURL]
 *
 * Returns URL to upload an ad photo to.
 *
 * @property adFormat Ad format: *1 — image and text,, *2 — big image,, *3 — exclusive format,, *4 — community, square image,, *7 — special app format.
 */
data class AdsGetUploadURL(
    var adFormat: GetUploadURLAdFormat
) : VkMethod<String>(
    "ads.getUploadURL",
    jacksonTypeRef()
), UserMethod
