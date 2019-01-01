package name.anton3.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonCreator

data class Flags @JsonCreator(mode = JsonCreator.Mode.DELEGATING) constructor(val flagsMask: Int) {

    fun has(flag: Int): Boolean {
        checkSingleBit(flag)
        return flagsMask and flag != 0
    }

    fun set(flag: Int): Flags {
        checkSingleBit(flag)
        return Flags(flagsMask or flag)
    }

    fun unset(flag: Int): Flags {
        checkSingleBit(flag)
        return Flags(flagsMask and flag.inv())
    }

    operator fun plus(other: Flags): Flags {
        return Flags(flagsMask or other.flagsMask)
    }

    operator fun minus(other: Flags): Flags {
        return Flags(flagsMask and other.flagsMask.inv())
    }

    private fun checkSingleBit(flag: Int) {
        require(java.lang.Integer.bitCount(flag) == 1)
    }

    companion object {
        val EMPTY = Flags(0)
    }
}
