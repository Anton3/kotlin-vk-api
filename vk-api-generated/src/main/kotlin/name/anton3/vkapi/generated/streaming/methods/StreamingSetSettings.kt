@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.streaming.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.streaming.objects.SetSettingsMonthlyTier
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/streaming.setSettings]
 *
 * No description
 *
 * @property monthlyTier No description
 */
data class StreamingSetSettings(
    var monthlyTier: SetSettingsMonthlyTier? = null
) : VkMethod<OkResponse, UserServiceMethod>("streaming.setSettings", jacksonTypeRef())
