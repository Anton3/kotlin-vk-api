@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.GetCategoriesResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.getCategories]
 *
 * Returns a list of possible ad categories.
 *
 * @property lang Language. The full list of supported languages is [vk.com/dev/api_requests|here].
 */
class AdsGetCategories : CheckedMethod<GetCategoriesResponse, UserMethod>("ads.getCategories", jacksonTypeRef())
