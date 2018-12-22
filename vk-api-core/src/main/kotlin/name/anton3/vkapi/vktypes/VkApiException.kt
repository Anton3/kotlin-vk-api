package name.anton3.vkapi.vktypes

import java.io.IOException

class VkApiException(val vkError: VkError) : IOException(vkError.toString())
