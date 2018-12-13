@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.ads.objects.GetCategoriesResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getCategories]
 *
 * Returns a list of possible ad categories.
 *
 * @property lang Language. The full list of supported languages is [vk.com/dev/api_requests|here].
 */
class AdsGetCategories : VkMethod<GetCategoriesResponse>(
    "ads.getCategories",
    jacksonTypeRef()
), UserMethod
