package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred

inline fun <T> CompletableDeferred<T>.complete(block: () -> T) {
    try {
        complete(block())
    } catch (e: Throwable) {
        completeExceptionally(e)
    }
}
