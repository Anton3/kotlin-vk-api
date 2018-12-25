package name.anton3.vkapi.executors

interface RateProvider {
    val rateLeft: Int

    /**
     * @param handler Returns true, if a request has likely been sent ("takes" the free rate)
     **/
    fun addFreeRateHandler(handler: () -> Boolean)
}

val RateProvider.isThrottling: Boolean
    get() = rateLeft <= 0
