package name.anton3.vkapi.executors

import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.vktypes.VkResponse

class ExceptionConverterMethodExecutor(
    private val base: MethodExecutor,
    private val exceptionConverter: (VkMethod<*>, Throwable) -> Nothing
) : MethodExecutor by base {

    override suspend fun execute(request: VkMethod<*>): VkResponse<*> {
        return runCatching { base.execute(request) }.getOrElse { exceptionConverter(request, it) }
    }
}
