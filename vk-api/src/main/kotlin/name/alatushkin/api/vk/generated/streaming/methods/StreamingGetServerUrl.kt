@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.streaming.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.streaming.objects.GetServerUrlResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/streaming.getServerUrl]
 *
 * Allows to receive data for the connection to Streaming API.
 *

 */
class StreamingGetServerUrl : VkMethod<GetServerUrlResponse>(
    "streaming.getServerUrl",
    jacksonTypeRef()
), ServiceMethod
