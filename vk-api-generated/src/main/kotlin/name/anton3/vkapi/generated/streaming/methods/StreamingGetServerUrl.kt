@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.streaming.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.streaming.objects.GetServerUrlResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.ServiceMethod

/**
 * [https://vk.com/dev/streaming.getServerUrl]
 *
 * Allows to receive data for the connection to Streaming API.
 *

 */
class StreamingGetServerUrl : CheckedMethod<GetServerUrlResponse, ServiceMethod>("streaming.getServerUrl", jacksonTypeRef())
