package name.alatushkin.vkapi.methods.longpoll.objects

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
data class Flags(val flagsMask: Long) {

    fun has(flag: Long): Boolean {
        checkSingleBit(flag)
        return flagsMask and flag != 0L
    }

    fun set(flag: Long): Flags {
        checkSingleBit(flag)
        return Flags(flagsMask or flag)
    }

    fun unset(flag: Long): Flags {
        checkSingleBit(flag)
        return Flags(flagsMask and flag.inv())
    }

    operator fun plus(other: Flags): Flags {
        return Flags(flagsMask or other.flagsMask)
    }

    operator fun minus(other: Flags): Flags {
        return Flags(flagsMask and other.flagsMask.inv())
    }

    private fun checkSingleBit(flag: Long) {
        require(java.lang.Long.bitCount(flag) == 1)
    }

    companion object {
        val EMPTY = Flags(0)
    }
}
