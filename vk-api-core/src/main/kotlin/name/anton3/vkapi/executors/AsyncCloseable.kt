package name.anton3.vkapi.executors

import java.io.Closeable

interface AsyncCloseable : Closeable {

    /**
     * Prevent new requests from executing
     * Precondition: join() has not been called
     */
    override fun close()

    /**
     * Wait until all remaining requests are executed
     * Precondition: close() has been called
     * Precondition: join() has not been called
     */
    suspend fun join()
}
