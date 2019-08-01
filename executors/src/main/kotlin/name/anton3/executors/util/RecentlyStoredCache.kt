package name.anton3.executors.util

import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentSkipListMap
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong

/**
 * A map-like container, which automatically removes older entries
 */
class RecentlyStoredCache<Key: Any, Value: Any>(cacheSize: Int) {

    fun merge(key: Key, block: (Value?) -> Value): Value {
        val newTick = ticker.getAndIncrement()

        var oldValueTemp: Pair<Long, Value>? = null
        val newValue = contents.compute(key) { _, x ->
            oldValueTemp = x
            Pair(newTick, block(x?.second))
        }!!
        val oldValue = oldValueTemp

        lastUpdated[newTick] = key

        if (oldValue != null) {
            lastUpdated.remove(oldValue.first)
        } else if (entriesLeft.getAndUpdate { maxOf(it - 1, 0) } == 0) {
            lastUpdated.pollFirstEntry()?.let { contents.remove(it.value) }
        }

        return newValue.second
    }

    private val contents: MutableMap<Key, Pair<Long, Value>> = ConcurrentHashMap()
    private val lastUpdated: NavigableMap<Long, Key> = ConcurrentSkipListMap()
    private val ticker: AtomicLong = AtomicLong(0)
    private val entriesLeft: AtomicInteger = AtomicInteger(cacheSize)
}
