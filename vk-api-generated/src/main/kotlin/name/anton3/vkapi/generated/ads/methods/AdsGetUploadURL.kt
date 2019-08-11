@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.GetUploadURLAdFormat
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.getUploadURL]
 *
 * Returns URL to upload an ad photo to.
 *
 * @property adFormat Ad format: *1 — image and text,, *2 — big image,, *3 — exclusive format,, *4 — community, square image,, *7 — special app format.
 */
data class AdsGetUploadURL(
    var adFormat: GetUploadURLAdFormat
) : CheckedMethod<String, UserMethod>("ads.getUploadURL", jacksonTypeRef())
