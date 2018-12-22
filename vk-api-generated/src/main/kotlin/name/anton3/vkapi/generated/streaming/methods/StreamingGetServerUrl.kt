@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.streaming.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.streaming.objects.GetServerUrlResponse
import name.anton3.vkapi.tokens.ServiceMethod

/**
 * [https://vk.com/dev/streaming.getServerUrl]
 *
 * Allows to receive data for the connection to Streaming API.
 *

 */
class StreamingGetServerUrl : VkMethod<GetServerUrlResponse>("streaming.getServerUrl", jacksonTypeRef()),
    ServiceMethod