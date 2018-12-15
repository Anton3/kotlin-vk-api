@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.streaming.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.streaming.objects.GetServerUrlResponse
import name.alatushkin.vkapi.tokens.ServiceMethod

/**
 * [https://vk.com/dev/streaming.getServerUrl]
 *
 * Allows to receive data for the connection to Streaming API.
 *

 */
class StreamingGetServerUrl : VkMethod<GetServerUrlResponse>("streaming.getServerUrl", jacksonTypeRef()),
    ServiceMethod
