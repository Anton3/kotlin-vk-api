@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.GetCategoriesResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getCategories]
 *
 * Returns a list of possible ad categories.
 *
 * @property lang Language. The full list of supported languages is [vk.com/dev/api_requests|here].
 */
class AdsGetCategories : VkMethod<GetCategoriesResponse>("ads.getCategories", jacksonTypeRef()),
    UserMethod
