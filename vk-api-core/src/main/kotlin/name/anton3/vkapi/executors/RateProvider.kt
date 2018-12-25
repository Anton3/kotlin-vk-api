package name.anton3.vkapi.executors

interface RateProvider {
    val rateLeft: Int

    // TODO avoid thread-unsafe interface
    fun setFreeRateHandler(handler: () -> Unit)
}

val RateProvider.isThrottling: Boolean
    get() = rateLeft <= 0
