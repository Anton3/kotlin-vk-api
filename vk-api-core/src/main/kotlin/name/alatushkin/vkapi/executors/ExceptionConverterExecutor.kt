package name.alatushkin.vkapi.executors

import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.vktypes.VkResponse

interface ExceptionConverter {
    suspend operator fun invoke(
        baseExecutor: MethodExecutor,
        method: VkMethod<*>,
        token: Token<*>,
        exception: Throwable
    ): Nothing

    companion object {
        val FORWARD = object : ExceptionConverter {
            override suspend fun invoke(
                baseExecutor: MethodExecutor,
                method: VkMethod<*>,
                token: Token<*>,
                exception: Throwable
            ): Nothing {
                throw exception
            }
        }
    }
}

class ExceptionConverterExecutor(
    private val base: MethodExecutor,
    private val exceptionConverter: ExceptionConverter
) : MethodExecutor by base {

    override suspend fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T> {
        return runCatching { base(method, token) }.getOrElse { exceptionConverter(base, method, token, it) }
    }
}
