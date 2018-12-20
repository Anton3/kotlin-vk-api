package name.anton3.vkapi.executors

import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.vktypes.VkResponse

class ExceptionConverterExecutor(
    private val base: MethodExecutor,
    private val exceptionConverter: (VkMethod<*>, Throwable) -> Nothing
) : MethodExecutor by base {

    override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> {
        return runCatching { base(method) }.getOrElse { exceptionConverter(method, it) }
    }
}
